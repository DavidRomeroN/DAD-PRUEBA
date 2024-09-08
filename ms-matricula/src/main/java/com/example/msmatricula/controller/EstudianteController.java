package com.example.msmatricula.controller;

import com.example.msmatricula.entity.Estudiante;
import com.example.msmatricula.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;

    @GetMapping()
    public ResponseEntity<List<Estudiante>> list(){
        return ResponseEntity.ok().body(estudianteService.listar());
    }

    @PostMapping()
    public ResponseEntity<Estudiante> save(@RequestBody Estudiante estudiante){
        return ResponseEntity.ok(estudianteService.guardar(estudiante));
    }

    @PutMapping()
    public ResponseEntity<Estudiante> update(@RequestBody Estudiante estudiante){
        return ResponseEntity.ok(estudianteService.actualizar(estudiante));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estudiante> listById(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok().body(estudianteService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id){
        estudianteService.eliminarPorId(id);
        return "Estudiante eliminado correctamente";
    }

}
