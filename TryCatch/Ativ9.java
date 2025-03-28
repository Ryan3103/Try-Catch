package tryCasth;

import java.util.Scanner;

    class TemperaturaInvalidaException extends Exception {
        public TemperaturaInvalidaException(String message) {
            super(message);
        }
    }
    public class Ativ9 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            try {
                System.out.print("Digite a temperatura em Celsius: ");
                double celsius = sc.nextDouble();

                if (celsius < -273.15) {
                    throw new TemperaturaInvalidaException("Temperatura abaixo do zero absoluto!");
                }

                double fahrenheit = (celsius * 9/5) + 32;
                System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
            } catch (TemperaturaInvalidaException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro: Entrada inválida.");
            } finally {
                sc.close();
            }
        }
    }