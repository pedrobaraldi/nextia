package br.com.fiap.netxai.config;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.fiap.netxai.model.Cliente;
import br.com.fiap.netxai.model.Produto;
import br.com.fiap.netxai.repository.ClienteRepository;
import br.com.fiap.netxai.repository.ProdutoRepository;

@Configuration
public class DatabaseSeeder implements CommandLineRunner {
    
    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    ProdutoRepository produtoRepository;

    @Override
   public void run(String... args) throws Exception {

        clienteRepository.saveAll(
            List.of(
                Cliente.builder().id(1L).nome("joao").cpf("32456768515").email("joao@gmail.com").senha("123").genero("masculino").dt_nascimento(LocalDate.parse("2024-04-12")).telefone("12345678945876").pontos(0).fidelidade("NÃOFILIADO").build(),
                Cliente.builder().id(2L).nome("gabi").cpf("12345678528").email("gabi@gmail.com").senha("456").genero("feminino").dt_nascimento(LocalDate.parse("2023-04-09")).telefone("65894236587526").pontos(1).fidelidade("FILIADO").build(),
                Cliente.builder().id(3L).nome("pedro").cpf("23456789496").email("pedro@gmail.com").senha("789").genero("masculino").dt_nascimento(LocalDate.parse("2015-03-24")).telefone("11986575235489").pontos(556).fidelidade("FILIADO").build(),
                Cliente.builder().id(4L).nome("otavio").cpf("33445566378").email("otavio@gmail.com").senha("2233").genero("masculino").dt_nascimento(LocalDate.parse("2024-09-02")).telefone("22486597621478").pontos(3).fidelidade("FILIADO").build(),
                Cliente.builder().id(5L).nome("giovanna").cpf("97554566378").email("giovanna@gmail.com").senha("1245").genero("feminino").dt_nascimento(LocalDate.parse("2023-05-12")).telefone("22894397621478").pontos(27).fidelidade("FILIADO").build()
            ));
        
        produtoRepository.saveAll(
            List.of(
                Produto.builder().id(1L).nome("sabão").categoria("limpeza").valor(98.5f).build(),
                Produto.builder().id(2L).nome("pão").categoria("padaria").valor(4.20f).build(),
                Produto.builder().id(3L).nome("salame").categoria("frios").valor(32.5f).build(),
                Produto.builder().id(4L).nome("sereal").categoria("sereal").valor(67.32f).build(),
                Produto.builder().id(5L).nome("água").categoria("bebida").valor(2.00f).build()
            ));
   }
       
}
