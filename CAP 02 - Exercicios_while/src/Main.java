/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ano:");
        int x = sc.nextInt();

        while(x != 2002){
            System.out.println("Senha Inválida");
            System.out.println("Digite novamente a senha:");
            x = sc.nextInt();
        }
        System.out.println("Senha Correta");
        sc.close();
    }
}*/

/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a coordenada x:");
        int x = sc.nextInt();
        System.out.println("Digite a coordenada y:");
        int y = sc.nextInt();

        while ( x != 0 || y != 0){
            if ( x > 0 && y > 0) {
                System.out.println("Primeiro Quadrante");
            }
            else if (x < 0 && y > 0){
                System.out.println("Segundo Quadrante");
            }
            else if (x > 0 && y < 0){
                System.out.println("Terceiro Quadrante");
            }
            else  {
            System.out.println("Quarto Quadrante");
            }
            System.out.println("Digite a coordenada x:");
            x = sc.nextInt();
            System.out.println("Digite a coordenada y:");
            y = sc.nextInt();
        }
        System.out.println("Sem Quadrante");
        sc.close();
    }
}*/

/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;


        System.out.println("Digite o código (1-Álcool, 2-Gasolina, 3-Diesel, 4-Fim):");
        int x = sc.nextInt();

        while (x != 4) {
            System.out.println("Digite o código (1-Álcool, 2-Gasolina, 3-Diesel, 4-Fim):");
            if (x == 1) {
                alcool = alcool + 1;
            } else if (x == 2) {
                gasolina = gasolina + 1;
            } else if (x == 3) {
                diesel = diesel + 1;
            }
            else{
                System.out.println("Número inválido");
                System.out.println("Digite o número novamente:");
            }
            x = sc.nextInt();
        }
            System.out.println("Muito Obrigado");
            System.out.println("Alcool: " + alcool);
            System.out.println("Gasolina: " + gasolina);
            System.out.println("Diesel: " + diesel);

            sc.close();
        }
    }*/

