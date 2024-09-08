package com.example.mscursos.service.Impl;

import com.example.mscursos.entity.Curso;
import com.example.mscursos.repository.CursoRepository;
import com.example.mscursos.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoServiceImpl implements CursoService {
    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public List<Curso> listar(){
        return cursoRepository.findAll();
    }

    @Override
    public Curso guardar(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public Curso actualizar(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public Optional<Curso> listarPorId(Integer id){
        return cursoRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id){
        cursoRepository.deleteById(id);
    }
}
