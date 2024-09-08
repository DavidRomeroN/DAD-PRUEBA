package com.example.mscursos.controller;

import com.example.mscursos.entity.Curso;
import com.example.mscursos.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoController {
    @Autowired
    private CursoService cursoService;

    @GetMapping()
    public ResponseEntity<List<Curso>> list(){
        return ResponseEntity.ok().body(cursoService.listar());
    }

    @PostMapping()
    public ResponseEntity<Curso> save(@RequestBody Curso curso){
        return ResponseEntity.ok(cursoService.guardar(curso));
    }

    @PutMapping()
    public ResponseEntity<Curso> update(@RequestBody Curso curso){
        return ResponseEntity.ok(cursoService.actualizar(curso));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curso> listById(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok().body(cursoService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id){
        cursoService.eliminarPorId(id);
        return "Curso eliminado correctamente";
    }
}
