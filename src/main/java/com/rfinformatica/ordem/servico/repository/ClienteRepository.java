package main.java.com.rfinformatica.ordem.servico.repository;

import dev.imrob.vendas.server.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {


}
