package com.sue.pessoaapi.pessoa;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //tem que ter
public class PessoaService {
  private final PessoaRepository repository;

  public PessoaService(PessoaRepository repository) {
    this.repository = repository;
  }

  public List<Pessoa> getAll() {
    List<Pessoa> p1 = repository.findAll();

    return p1;
  }

  public ResponseEntity<Pessoa> savePessoa(Pessoa pessoa) {
    pessoa = repository.save(pessoa);
    return ResponseEntity.status(HttpStatus.CREATED).body(pessoa);
  }


}
