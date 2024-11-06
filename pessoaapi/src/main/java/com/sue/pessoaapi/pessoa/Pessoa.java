package com.sue.pessoaapi.pessoa;

import com.sue.pessoaapi.stack.Stack;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;


//MINHA ENTIDADE
@Entity(name = "tb_pessoa")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pessoa {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) // spring gera o id
  private Integer id;

  private String apelido;
  private String nome;
  private String nascimento;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(
      name = "stacks_pessoas",
      joinColumns = @JoinColumn(name = "id"),
      inverseJoinColumns = @JoinColumn(name = "stack_id")
  )
  private Set<Stack> stacks;
}
