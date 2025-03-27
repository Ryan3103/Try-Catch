package Trycast;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ativ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.print("Digite o primeiro número: ");
            Integer num1 = sc.nextInt();

            System.out.print("Digite o segundo número: ");
            Integer num2 = sc.nextInt();

            try {
                Integer resultado = num1 / num2;
                System.out.println("Resultado da divisão: " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("Erro: Não é possível dividir por zero.");
            } catch (InputMismatchException e){
                System.out.println("Input error");
            } catch (Exception e) {
                sc.close();
            }
        }
    }