package org.example.principio.responsabilidade;

public class Main {
    public static void main(String[] args) {
        ContaBancaria bancaria = new ContaBancaria();
        bancaria.setDescricao("Minha conta");

        System.out.println(bancaria);

        bancaria.diminui100Reais();
        bancaria.diminui100Reais();

        System.out.println(bancaria);

        bancaria.sacarDinheiro(400);

        System.out.println(bancaria);

        bancaria.depositar(1000);

        System.out.println(bancaria);
    }
}
