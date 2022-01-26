package br.com.exp.banco_digital.model;

import br.com.exp.banco_digital.conta.Conta;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Banco {
    private String nome;
    private List<Conta> contas;
}
