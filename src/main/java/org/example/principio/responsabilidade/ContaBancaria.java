package org.example.principio.responsabilidade;

public class ContaBancaria {
    private String descricao;

    private double saldo = 8_000;

    public void soma100Reais() {
        saldo += 100;
    }

    public void diminui100Reais() {
        saldo -= 100;
    }

    public void sacarDinheiro(double valorSaque) {
        saldo -= valorSaque;
    }

    public void depositar(double deposito) {
        saldo += deposito;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "descricao='" + descricao + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
