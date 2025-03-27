package Trycast;

import java.util.Scanner;

public class Ativ6 {
    public static class DadosInvalidosException extends Exception {
    public DadosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

                try {

                    System.out.print("Digite o seu nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Digite a sua idade: ");
                    int idade = sc.nextInt();

                    if (nome.isEmpty()) {
                        throw new DadosInvalidosException("Nome não pode ser vazio.");
                    }

                    if (idade < 0) {
                        throw new DadosInvalidosException("Idade não pode ser negativa.");
                    }

                    System.out.println("Cadastro realizado com sucesso!");
                    System.out.println("Nome: " + nome);
                    System.out.println("Idade: " + idade);

                } catch (DadosInvalidosException e) {
                    System.out.println("Erro: " + e.getMessage());
                } finally {
                    sc.close();
                }
            }
        }