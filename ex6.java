import java.util.Scanner;
import java.util.Random;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int num1, num2, MaiorNumero, MenorNumero, NumeroSorteado;

        System.out.print("Digite o primeiro número inteiro: ");
        num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        num2 = scanner.nextInt();

        MenorNumero = Math.min(num1, num2);
        MaiorNumero = Math.max(num1, num2);

        NumeroSorteado = random.nextInt((MaiorNumero - MenorNumero) + 1) + MenorNumero;

        if (NumeroSorteado % 2 == 0) {
            System.out.println("Número sorteado: " + NumeroSorteado);
            System.out.println("Este número é par.");
        } else {
            System.out.println("Número sorteado: " + NumeroSorteado);
            System.out.println("Este número é ímpar.");
        }

        scanner.close();
    }
}