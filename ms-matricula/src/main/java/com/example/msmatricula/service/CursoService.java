package com.example.msmatricula.service;

import com.example.msmatricula.entity.Curso;

import java.util.List;
import java.util.Optional;

public interface CursoService {
    public List<Curso> listar();
    public Curso guardar(Curso curso);
    public Curso actualizar(Curso curso);
    public Optional<Curso> listarPorId(Integer id);
    public void eliminarPorId(Integer id);
}
