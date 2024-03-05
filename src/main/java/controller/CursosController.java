package controller;

import model.Aluno;
import model.Cursos;
import org.springframework.web.bind.annotation.*;
import service.AlunoService;
import service.CursoService;

import java.util.List;

@RestController
@RequestMapping("curso")
public class CursosController {

    private final CursoService cursoService;

    public CursosController(CursoService cursoService) {
        this.cursoService = cursoService;
    }
    @GetMapping
    public List<Aluno> get() {

        return cursoService.buscarCurso();
    }
    @PostMapping
    public Cursos post(@RequestBody Cursos curso) throws Exception {
        return cursoService.cadastrarCurso(curso);
    }
}
