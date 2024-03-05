package service;

import model.Aluno;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class AlunoService {
    public List<Aluno>buscarAlunos() {
        return (List<Aluno>) Aluno.getAluno();
    }
    public Aluno buscarId(Integer id) throws Exception {
        return Aluno.buscarId(id);
    }
    public Aluno cadastrarAluno(Aluno aluno) throws Exception {
        if (validarAluno(aluno)) {
            return Aluno.cadastrarAluno(aluno);
        }
        return null;
    }

    public boolean validarAluno (Aluno aluno) throws Exception {
        if (!StringUtils.hasText(aluno.getNome())) {
            throw new Exception("É preciso digitar o nome do aluno");
        }
        if (aluno.getDataDeNascimento() == null) {
            throw  new Exception("A data de nascimento é obrigatória!");
        }
        return true;
    }

}
