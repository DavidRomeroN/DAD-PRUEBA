package com.example.msmatricula.service;

import com.example.msmatricula.entity.Pago;

import java.util.List;
import java.util.Optional;

public interface PagoService {
    public List<Pago> listar();
    public Pago guardar(Pago pago);
    public Pago actualizar(Pago pago);
    public Optional<Pago> listarPorId(Integer id);
    public void eliminarPorId(Integer id);
}
