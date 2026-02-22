package Aplicattion;

import entities.Cliente;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.println("Bem Vindo Ao Sistema Do Banco X");
        System.out.println("Entre com o número da sua conta:");
        int num_conta = sc.nextInt();
        sc.nextLine();

        System.out.println("Entre com o Nome Do titular da conta:");
        String nome = sc.nextLine();

        System.out.println("Deseja fazer um Depósito inicial?");
        String x = sc.nextLine();

        Cliente cliente = new Cliente(num_conta, nome);

        if (x.equals("y")) {
            System.out.println("Digite o Saldo para o Depósito Inicial:");
            double deposito = sc.nextDouble();
            cliente.addSaldo(deposito);
        }
        System.out.println("Dados da Conta : "+ cliente);

        System.out.println("Coloque um valor para depósito da conta");
        double adicionar = sc.nextDouble();
        cliente.addSaldo(adicionar);

        System.out.println("Dados da Conta : "+ cliente);

        System.out.println("Coloque o valor para remover do saldo:");
        double retirada = sc.nextDouble();
        cliente.removeSaldo(retirada);

        System.out.print("Dados da Conta : "+ cliente);


        sc.close();
    }
}
