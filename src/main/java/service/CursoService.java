package service;

import model.Aluno;
import model.Cursos;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class CursoService {
    public List<Cursos>buscarCursos() {
        return (List<Cursos>) Cursos.getCurso();
    }
    public Cursos buscarId(Integer id) throws Exception {
        return Cursos.buscarId(id);
    }
    public Cursos cadastrarCurso(Cursos curso) throws Exception {
        if (validarCurso(curso)) {
            return Cursos.cadastrarCurso(curso);
        }

        return null;
    }

    public boolean validarCurso (Cursos curso) throws Exception {
        if (!StringUtils.hasText(curso.getNome())) {
            throw new Exception("É preciso digitar o nome do curso");
        }
        return true;
    }

    public List<Aluno> buscarCurso() {
        return null;
    }
}
