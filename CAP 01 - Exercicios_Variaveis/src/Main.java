/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        /*Scanner sc = new Scanner(System.in);

        int x;
        int y;
        int soma;

        x = sc.nextInt();
        y = sc.nextInt();
        soma = x + y;

        System.out.println("Dados Digitados:");
        System.out.println(x);
        System.out.println(y);
        System.out.printf("Resultado da soma é = " + soma);

        sc.close();

    }
}*/

/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159

import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double x;
        double pi;
        int y;
        double area;

        System.out.println("Para calcular a área de um circulo digite seu raio: ");
        x = sc.nextDouble();

        pi = 3.14159;
        y = 2;
        area = pi*(Math.pow(x,y));

        System.out.printf("A área de um circulo é: %.4f%n", area);


        sc.close();
    }

}*/

/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int A;
        int B;
        int C;
        int D;
        int DIFERENCA;


        System.out.println("Digite 4 valores para saber a diferença do produto entre ele, primeiro valor:");
        A = sc.nextInt();
        System.out.println("Segundo Valor: ");
        B = sc.nextInt();
        System.out.println("Terceiro Valor: ");
        C = sc.nextInt();
        System.out.println("Quarto Valor");
        D = sc.nextInt();

        DIFERENCA = (A*B-C*D);

        System.out.printf("A Diferença do produto A e B pelo produto C e D é = " + DIFERENCA);
    }
}*/

/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.

import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x;
        double y;
        double z;
        double sal;

        System.out.println("Para calcular o seu salario pelo valor da sua hora trabalhada, digite seu número:");
        x = sc.nextInt();
        System.out.println("Em seguida agora digite a quantidade de horas trabalhadas:");
        y = sc.nextDouble();
        System.out.println("Agora digite o valor das horas trabalhadas:");
        z = sc.nextDouble();

        sal = y * z;

        System.out.println("O seu numero é :"+ x);
        System.out.printf("O seu salário de acordo com suas horas trabalhadas e o valor das horas desta é : U$$ %.2f%n", sal);
    }
}*/

/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A;
        int B;
        double C;
        int D;
        int E;
        double F;
        double total;

        System.out.println("Digite o código da peça 1: ");
        A = sc.nextInt();
        System.out.println("Digite o número de peças, da peça 1: ");
        B = sc.nextInt();
        System.out.println("Digite o valor unitário de cada peça: ");
        C = sc.nextDouble();
        System.out.println("Digite o código da peça 2: ");
        D = sc.nextInt();
        System.out.println("Digite o número de peças, da peça 2: ");
        E = sc.nextInt();
        System.out.println("Digite o valor unitário da peça 2: ");
        F = sc.nextDouble();

        total = (B*C)+(E*F);

        System.out.printf("Valor total a pagar = R$ %.2f%n", total);
    }
}*/

/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A;
        double B;
        double C;
        double TRIANGULO;
        double CIRCULO;
        double TRAPEZIO;
        double QUADRADO;
        double RETANGULO;
        double pi;
        int y;

        pi = 3.14149;
        y = 2;

        System.out.println("Digite o primeiro valor para calcular ás áreas de um triangulo, circulo, trapezio, quadrado, retangulo:");
        A = sc.nextDouble();
        System.out.println("Digite o segundo valor: ");
        B = sc.nextDouble();
        System.out.println("Digite o terceiro valor: ");
        C = sc.nextDouble();

        TRIANGULO = (A * C)/2;
        CIRCULO = pi*(Math.pow(C,y));
        TRAPEZIO =  ((A+B)*C)/2;
        QUADRADO = Math.pow(B,y);
        RETANGULO = A*B;

        System.out.printf("TRIANGULO: %.3f%n",TRIANGULO);
        System.out.printf("CIRCULO: %.3f%nn", CIRCULO);
        System.out.printf("TRAPEZIO: %.3f%n", TRAPEZIO);
        System.out.printf("QUADRADO: %.3f%n", QUADRADO);
        System.out.printf("RETANGULO: %.3f%n", RETANGULO);

        sc.close();
    }
}*/