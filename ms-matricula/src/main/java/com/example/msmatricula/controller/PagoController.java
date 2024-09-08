package com.example.msmatricula.controller;

import com.example.msmatricula.entity.Pago;
import com.example.msmatricula.service.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pago")
public class PagoController {
    @Autowired
    private PagoService pagoService;

    @GetMapping()
    public ResponseEntity<List<Pago>> list(){
        return ResponseEntity.ok().body(pagoService.listar());
    }

    @PostMapping()
    public ResponseEntity<Pago> save(@RequestBody Pago pago){
        return ResponseEntity.ok(pagoService.guardar(pago));
    }

    @PutMapping()
    public ResponseEntity<Pago> update(@RequestBody Pago pago){
        return ResponseEntity.ok(pagoService.actualizar(pago));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pago> listById(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok().body(pagoService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id){
        pagoService.eliminarPorId(id);
        return "Pago eliminado correctamente";
    }
}
