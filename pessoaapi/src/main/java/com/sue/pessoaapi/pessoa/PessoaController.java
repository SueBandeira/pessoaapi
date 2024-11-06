package com.sue.pessoaapi.pessoa;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
  private final PessoaService service;

  public PessoaController(PessoaService service) {
    this.service = service;
  }

  @GetMapping("/todas-pessoas")
  public ResponseEntity<List<Pessoa>> findAll() { //Ver melhor o response entity
    List<Pessoa> pessoas = service.getAll();
    return ResponseEntity.ok(pessoas);
  }

  @PostMapping
  public ResponseEntity<Pessoa> createPessoa(@RequestBody Pessoa pessoa) {
    return service.savePessoa(pessoa);
  }

}
