/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.

import java.util.Scanner;

public class Main{
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Valor Para Saber seus impares começando pelo 1");
        int x = sc.nextInt();
        int i;
        int a = 0;

        for(i=0; x >=1 && x <=1000; i = i--) {
            a = x%2;
            if(a != 0){
                System.out.println("Impares:"+ x);
            }
            x = x-1;
        }
        sc.close();
    }
}*/

/* Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

import java.util.Scanner;

public class Main{
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite Quantos números vc quer checar:");
        int n = sc.nextInt();
        int in = 0;
        int out = 0;
        int i;

        for(i=0; i<n; i++){
            System.out.println("Digite o valor para checar se está entre 10 e 20: ");
            int x = sc.nextInt();

            if(x >= 10 && x<=20) {
                in++;
            }
            else{
                out++;
            }
        }

        System.out.println("Números dentro:"  + in);
        System.out.print("Números fora: "+ out);

        sc.close();
    }
}*/

/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.

import java.util.Locale;
import java.util.Scanner;


public class Main{
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de vezes para testar e mostrar a média ponderada dos números:");
        int x = sc.nextInt();

        for(int i = 0; i< x; i++){
            System.out.println("Digite um número:");
            double a = sc.nextDouble();
            System.out.println("Digite o segundo número:");
            double b = sc.nextDouble();
            System.out.println("Digite o terceiro número:");
            double c = sc.nextDouble();

            double media = (a*2 + b*3 + c*5)/10;
            System.out.println("A média será: " + media);
        }
    }
}
*/

/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas divisões vc vai fazer:");
        int a = sc.nextInt();

        for(int i =0; i<a; i++){
            System.out.println("Digite o numerador:");
            int x = sc.nextInt();
            System.out.println("Digite o denominador:");
            int y = sc.nextInt();

            double w = (double) x /y;

            if(y == 0){
                System.out.print("Não é possíve dividir.");
            }
            System.out.println("Resultado da Divisão:" + w);
        }


    }
}*/

/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial de 0 é 1.*/

import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número e veja seu fatorial:");
        int x = sc.nextInt();

        int fatorial = 1;

        for(int i = x; i > 1; i--){
            fatorial = fatorial * i;

            if (x == 0){
                fatorial = 1;
            }

        }
        System.out.println("Fatorial é: " + fatorial);

        sc.close();
    }
}