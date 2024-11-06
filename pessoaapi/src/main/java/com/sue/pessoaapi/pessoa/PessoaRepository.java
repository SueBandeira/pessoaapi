package com.sue.pessoaapi.pessoa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //OPCIONAL
public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
