package br.com.fiap.netxai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.netxai.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
