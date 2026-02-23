/*Problema Exemplo 1
Fazer um programa para ler um número inteiro N e a altura de N
pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
altura média dessas pessoas.



package aplicattion;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i =0; i<n; i++){
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i=0; i<n; i++){
            sum += vect[i];
        }
        double avg = sum/n;

        System.out.printf("Média de altura: %.2f%n",avg);

        sc.close();
    }
}
*/

/* PROBLEMA EXEMPLO 2
Fazer um programa para ler um número inteiro N e os dados (nome e
preço) de N Produtos. Armazene os N produtos em um vetor. Em
seguida, mostrar o preço médio dos produtos.
 */

package  aplicattion;


import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program{
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for(int i =0; i<n;i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect [i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i<n; i++){
            sum += vect[i].getPrice();
        }

        double avg = sum/n;

        System.out.printf("A média de preço é : R$ %.2f%n",avg);

        sc.close();
    }
}