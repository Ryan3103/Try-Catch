package tryCasth;

import java.util.Scanner;

class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String message) {
        super(message);
    }
}
    public class Ativ8 {

        public class VerificacaoIdade {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                try {
                    System.out.print("Digite sua idade: ");
                    int idade = sc.nextInt();

                    if (idade < 0) {
                        throw new IdadeInvalidaException("Idade não pode ser negativa.");
                    }

                    if (idade >= 18) {
                        System.out.println("Você é maior de idade.");
                    } else {
                        System.out.println("Você é menor de idade.");
                    }
                } catch (IdadeInvalidaException e) {
                    System.out.println("Erro: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("Erro: Entrada inválida.");
                } finally {
                    sc.close();
                }
            }
        }
    }