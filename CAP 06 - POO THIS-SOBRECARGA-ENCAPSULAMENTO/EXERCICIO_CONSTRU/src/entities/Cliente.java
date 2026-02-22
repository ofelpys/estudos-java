package entities;

public class Cliente {

    private int num_conta;
    private String nome;
    private double saldo;

    public Cliente(int num_conta, String nome) {
        this.num_conta = num_conta;
        this.nome = nome;
        this.saldo = 0.0;
    }

    public void addSaldo(double saldo) {
        this.saldo += saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void removeSaldo(double saldo){
        this.saldo -= saldo;
    }

    public String toString(){
        return "Num da Conta:"
                + num_conta
                +", Nome do titular:"
                + nome
                +", Saldo: $"
                + String.format("%.2f",getSaldo());
    }
}




