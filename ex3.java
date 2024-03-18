import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, c;

        System.out.println("Informe o coeficiente A");
        a = scanner.nextDouble();

        System.out.println("Informe o coeficiente B");
        b = scanner.nextDouble();

        System.out.println("Informe o coeficiente C");
        c = scanner.nextDouble();

        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } else if (a == 0 && b != 0) {
            System.out.println("Essa é uma equação de primeiro grau.");
            double raiz = -c / b;
            System.out.println("Raiz da equação: " + raiz);
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Essa equação não possui raízes reais.");
            } else if (delta == 0) {
                System.out.println("Essa equação possui duas raízes reais iguais.");
                double raiz = -b / (2 * a);
                System.out.println("Raiz da equação: " + raiz);
            } else {
                System.out.println("Essa equação possui duas raízes reais diferentes.");
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Raiz 1 da equação: " + raiz1);
                System.out.println("Raiz 2 da equação: " + raiz2);
            }
        }

        scanner.close();
    }
}