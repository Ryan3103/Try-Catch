package Trycast;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ativ4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite um numero: ");
            Integer num1 = sc.nextInt();

            System.out.println("Digite outro número: ");
            Integer num2 = sc.nextInt();

            Integer soma = num1 + num2;
            System.out.println("A soma dos números é: " + soma);

            if (soma < 0) {
                throw new InputMismatchException("Entrada inválida!");
            }
        }catch(InputMismatchException e){
                System.out.println("Número inválido!");

            } finally{
                sc.close();
            }
    }
}