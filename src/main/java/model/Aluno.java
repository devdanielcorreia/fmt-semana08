package model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Getter
public class Aluno {

    private static Integer id = 0;
    private static List<Aluno> alunos = new ArrayList<>();
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

    public static List<Aluno> getAluno() {
        List alunos = null;
        return alunos;
    }

    public static Aluno buscarId(Integer id) throws Exception {
        for (Aluno aluno : alunos) {
            if (aluno.getId().equals(id)) {
                return aluno;
            }
        }
        throw new Exception("Aluno não encontrado!");
    }

    private Object getId() {
        return null;
    }

    public static Aluno cadastrarAluno(Aluno aluno) {
        aluno.id = calcularId();
        alunos.add(aluno);
        return aluno;
    }

    public String getNome() {
        return null;
    }

    public LocalDate getDataDeNascimento() {
        return null;
    }
}
