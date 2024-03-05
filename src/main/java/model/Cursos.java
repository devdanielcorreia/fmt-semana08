package model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Data
@Getter
public class Cursos {

    private static Integer id = 0;
    @Setter
    private String nome;
    @Setter
    private String descricao;
    @Setter
    private Integer cargaHoraria;

    public Cursos(String nome, String descricao, Integer cargaHoraria) {
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public static synchronized int calcularId() {
        return ++id;
    }
}
