package com.example.msmatricula.service.Impl;

import com.example.msmatricula.entity.Estudiante;
import com.example.msmatricula.repository.EstudianteRepository;
import com.example.msmatricula.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public List<Estudiante> listar(){
        return estudianteRepository.findAll();
    }

    @Override
    public Estudiante guardar(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public Estudiante actualizar(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public Optional<Estudiante> listarPorId(Integer id){
        return estudianteRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id){
        estudianteRepository.deleteById(id);
    }
}
