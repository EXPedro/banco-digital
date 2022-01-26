package br.com.exp.banco_digital;

import br.com.exp.banco_digital.model.Cliente;
import br.com.exp.banco_digital.model.ContaCorrente;
import br.com.exp.banco_digital.model.ContaPoupanca;
import br.com.exp.banco_digital.conta.Conta;

public class MainBancoDigitalApp {
    public static void main(String[] args) {
        Cliente helga = new Cliente();
        helga.setNome("Helga Elize B Mendes");

        Conta cc = new ContaCorrente(helga);
        Conta poupanca = new ContaPoupanca(helga);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
