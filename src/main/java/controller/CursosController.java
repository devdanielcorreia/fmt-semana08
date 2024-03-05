package controller;

import model.Aluno;
import model.Cursos;
import org.springframework.http.ResponseEntity;
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
    @PostMapping("/{cursoId}/matricular")
    public ResponseEntity<?> matricularAluno(@PathVariable("cursoId") Integer cursoId, @RequestBody Integer alunoId) {
        try {

            cursoService.matricularAluno(cursoId, alunoId);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
