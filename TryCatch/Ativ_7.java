package Try_Catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ativ_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite três notas");
            System.out.print("Digite a primeira nota: ");
            Double num1 = sc.nextDouble();
            System.out.print("Digite a segunda nota: ");
            Double num2 = sc.nextDouble();
            System.out.print("Digite a terceira nota: ");
            Double num3 = sc.nextDouble();

            Double result = num1 + num2 + num3 / 3;
            System.out.println("O reusltado é: "+result);
        } catch (InputMismatchException e){
            System.out.println("A nota não é válida");
        } finally {
            sc.close();
        }
    }
}
