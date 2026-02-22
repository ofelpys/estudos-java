/*Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
projetada abaixo.*/

package aplicattion;

import entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class salario {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Funcionario x;
        x = new Funcionario();

        System.out.println("Digite o Nome do Funcionário:");
        x.a = sc.nextLine();
        System.out.println("Digite o Salário Bruto:");
        x.sal_bruto = sc.nextDouble();
        System.out.println("Digite a taxa sobre o Salário:");
        x.taxa = sc.nextDouble();

        System.out.println("Nome do Empregado:" + x);
        System.out.println("Qual a porcentagem para aumentar o salário?:");
        double porcentagem = sc.nextDouble();
        x.sal_atual(porcentagem);

        System.out.println("Dados atualizados: " + x);

    }
}
