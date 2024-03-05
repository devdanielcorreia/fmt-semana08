package model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Data
@Getter
public class Aluno {

    private static Integer id = 0;
    @Setter
    private String nome;
    @Setter
    private LocalDate dataDeNascimento;

    public Aluno(String nome, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

        public static synchronized int calcularId() {
        return ++id;
    }
}
