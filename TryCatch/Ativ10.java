package tryCasth;

import java.util.Scanner;

class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String message) {
        super(message);
    }
}
class LimiteFatorialExcedidoException extends Exception {
    public LimiteFatorialExcedidoException(String message) {
        super(message);
    }
}
public class Ativ10 {

        public static int fatorial(int n) throws LimiteFatorialExcedidoException {
            if (n > 20) {
                throw new LimiteFatorialExcedidoException("Número maior que 20 excede o limite de recursão.");
            }
            if (n < 0) {
                return 1;
            }
            return n * fatorial(n - 1);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            try {
                System.out.print("Digite um número para calcular o fatorial: ");
                int numero = sc.nextInt();

                if (numero < 0) {
                    throw new NumeroNegativoException("Número negativo não é permitido.");
                }

                int resultado = fatorial(numero);
                System.out.println("Fatorial de " + numero + " é: " + resultado);
            } catch (NumeroNegativoException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (LimiteFatorialExcedidoException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro: Entrada inválida.");
            } finally {
                sc.close();
            }
        }
    }