package br.com.fiap.netxai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.netxai.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
