/*
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Qual o número?");
        numero = sc.nextInt();

        if(numero < 0) {
            System.out.println("Número negativo");
        }
        else{
            System.out.println("Número Positivo");
        }

        sc.close();
    }
}
*/

/*
Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Qual o número?");
        numero = sc.nextInt();

        if(numero % 2 == 0) {
            System.out.println("Número Par");
        }
        else{
            System.out.println("Número Impar");
        }

        sc.close();
    }
}
*/

/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.

import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int A;
        int B;

        System.out.println("Qual o primeiro número?");
        A = sc.nextInt();
        System.out.println("Qual o segundo número?");
        B = sc.nextInt();

        if(A % B == 0 || B % A ==0) {
            System.out.println("Números Múltiplos");
        }
        else{
            System.out.println("Números Não Múltiplos");
        }

        sc.close();
    }
}
 */

/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.


import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int A;
        int B;

        System.out.println("Qual a hora inicial?");
        A = sc.nextInt();
        System.out.println("Qual a hora final?");
        B = sc.nextInt();

        int duracao;

        if( A < B) {
            duracao = B - A;
        }
        else{
            duracao = 24 - A + B;
        }

        System.out.println("O Jogo durou " + duracao + "Horas(s)");

        sc.close();
    }
}
*/

/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
 */


import java.util.Locale;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int A;
        int B;

        System.out.println("Qual o código do item?");
        A = sc.nextInt();
        System.out.println("Qual a quantidade desse item?");
        B = sc.nextInt();

        double total = 0;

        if( A == 1) {
            total = B * 4.00;
        }
        else if(A == 2){
            total = B * 4.50;
        }
        else if (A == 3){
            total = B * 5.00;
        }
        else if(A == 4){
            total = B * 2.00;
        }
        else if (A == 5){
            total = B * 1.50;
        }
        else{
            System.out.println("Digite um número válido");
        }

        System.out.println("Total do pedido R$" + total);

        sc.close();
    }
}