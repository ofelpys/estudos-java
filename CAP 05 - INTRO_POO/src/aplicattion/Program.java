/*Fazer um programa para ler os valores da largura e altura de um retângulo.
Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal. Usar uma classe como
mostrado no projeto ao lado.*/

package aplicattion;

import entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo x;
        x = new Retangulo();

        System.out.println("Coloque a Altura do Retangulo:");
        x.a = sc.nextDouble();
        System.out.println("Coloque a Largura do Retangulo:");
        x.b =  sc.nextDouble();

        double areaR = x.area();
        double perimetroR = x.perimetro();
        double diagonalR = x.diagonal();

        System.out.printf("A Area é: %.2f%n", areaR);
        System.out.printf("O Perimtro é é: %.2f%n", perimetroR);
        System.out.printf("A Diagonal é: %.2f%n", diagonalR);
        sc.close();
    }
}
