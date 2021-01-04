package com.clientes.apirest.controller;


import com.clientes.apirest.models.Clientes;
import com.clientes.apirest.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ClientesController {

    @Autowired
    ClientesRepository clientesRepository;

    @GetMapping("/Clientes")
    public List<Clientes> listaClientes(){
        return clientesRepository.findAll();
    }

    @GetMapping("/Clientes/{id}")
    public Clientes listaClientesID(@PathVariable(value = "id") long id){
        return clientesRepository.findById(id);
    }

    @PostMapping("/Clientes")
    public Clientes salvaClientes(@RequestBody Clientes clientes){
        return clientesRepository.save(clientes);
    }

    @DeleteMapping("/Clientes")
    public void deletaClientes(@RequestBody Clientes clientes){
        clientesRepository.delete(clientes);
    }

    @PutMapping("/Clientes")
    public Clientes AlteraClientes(@RequestBody Clientes clientes){
        return clientesRepository.save(clientes);
    }




}
