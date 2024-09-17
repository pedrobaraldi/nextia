package br.com.fiap.netxai.controller;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;


import br.com.fiap.netxai.model.Cliente;
import br.com.fiap.netxai.repository.ClienteRepository;
import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "https://witty-desert-0abd3be0f.5.azurestaticapps.net")
@RestController
@RequestMapping("cliente")
@Slf4j
public class ClienteController {
    
    @Autowired
    ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> index(){
        return clienteRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public ResponseEntity<Cliente> create(@RequestBody Cliente cliente){
        log.info("cadastrando cliente: {}", cliente);
        Cliente savedCliente = clienteRepository.save(cliente);
        return ResponseEntity.status(CREATED).body(savedCliente);
    }

    @GetMapping("{id}")
    public ResponseEntity<Cliente> get(@PathVariable Long id){
        log.info("buscando por id: {}", id);
        return clienteRepository.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("{id}")
    public ResponseEntity<Cliente> update(@PathVariable Long id, @RequestBody Cliente cliente){
        log.info("atualizando cliente id {} para {}", id, cliente);

        verificarSeExisteCliente(id);

        cliente.setId(id);
        Cliente updatedCliente = clienteRepository.save(cliente);

        return ResponseEntity.ok(updatedCliente);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(NO_CONTENT)
    public void destroy(@PathVariable Long id) {
        log.info("apagando cliente {}", id);

        verificarSeExisteCliente(id);
        clienteRepository.deleteById(id);
    }


    private void verificarSeExisteCliente(Long id) {
        clienteRepository.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente não encontrado"));
    }

}
