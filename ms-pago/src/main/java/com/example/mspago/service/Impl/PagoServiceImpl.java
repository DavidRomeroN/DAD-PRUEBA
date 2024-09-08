package com.example.mspago.service.Impl;

import com.example.mspago.entity.Pago;
import com.example.mspago.repository.PagoRepository;
import com.example.mspago.service.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagoServiceImpl implements PagoService {
    @Autowired
    private PagoRepository pagoRepository;

    @Override
    public List<Pago> listar(){
        return pagoRepository.findAll();
    }

    @Override
    public Pago guardar(Pago pago) {
        return pagoRepository.save(pago);
    }

    @Override
    public Pago actualizar(Pago pago) {
        return pagoRepository.save(pago);
    }

    @Override
    public Optional<Pago> listarPorId(Integer id){
        return pagoRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id){
        pagoRepository.deleteById(id);
    }
}
