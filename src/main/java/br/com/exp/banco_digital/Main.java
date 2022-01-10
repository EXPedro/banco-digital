package br.com.exp.banco_digital;

public class Main {
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
