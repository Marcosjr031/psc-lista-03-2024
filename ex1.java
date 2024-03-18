import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2, num3, media;

        System.out.println("Informe o primeiro número");
        num1 = scanner.nextDouble();

        System.out.println("Informe o segundo número");
        num2 = scanner.nextDouble();

        System.out.println("Informe o terceiro número");
        num3 = scanner.nextDouble();

        if (num1 > num2 && num1 > num3) {
            System.out.println("O maior número é: " + num1);
        }

        else if (num2 > num1 && num2 > num3) {
            System.out.println("O maior número é: " + num2);
        }

        else if (num3 > num1 && num3 > num2) {
            System.out.println("O maior número é: " + num3);
        }

        else {
            System.out.println("Numeros inválidos");
        }

        if (num1 < num2 && num1 < num3) {
            System.out.println("O menor número é: " + num1);
        }

        else if (num2 < num1 && num2 < num3) {
            System.out.println("O menor número é: " + num2);
        }

        else if (num3 < num1 && num3 < num2) {
            System.out.println("O menor número é: " + num3);
        }

        else {
            System.out.println("Numeros inválidos");

        }

        media = ((num1 + num2 + num3) / 3);

        System.out.println("A média dos números é: " + media);

        scanner.close();

    }

}