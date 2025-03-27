package Trycast;

import java.util.Scanner;

public class Ativ2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite um numero: ");
            String texto = sc.next();
            Integer num = Integer.parseInt(texto);

            System.out.println("O numero é " + num);
        } catch (NumberFormatException e) {
            System.out.println("Erro! Não pode caractere");
        } finally {
            sc.close();
        }
    }
}