package model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Getter
public class Cursos {

    private static Integer id = 0;
    private static List<Cursos> cursos = new ArrayList<>();

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
    public static Cursos cadastrarCurso(Cursos curso) {
        curso.id = calcularId();
        cursos.add(curso);
        return curso;
    }

    public static Object getCurso() {
        return null;
    }

    public static Cursos buscarId(Integer id) {
        return null;
    }

    public String getNome() {
        return null;
    }
}
