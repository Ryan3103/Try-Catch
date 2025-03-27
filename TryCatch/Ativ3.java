package Trycast;

import java.util.Scanner;

public class Ativ3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite um numero: ");
            Integer num = sc.nextInt();

            if (num < 0){
                throw new IllegalArgumentException("Entrada inválida!");
        }

        double resultado = Math.sqrt(num);
            System.out.println("A raiz quadrada de " + num + " é " + resultado);

        } catch (IllegalArgumentException e){
            System.out.println("Entrada inválida!");
        } finally {
            sc.close();
        }
    }
}