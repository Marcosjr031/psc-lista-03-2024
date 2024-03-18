import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double perimetro, area, volume, raio, pi;

        System.out.print("Digite o indicador de operação (1: Perímetro do círculo, 2: Área do círculo, 3: Volume da esfera): ");
        int operacao = scanner.nextInt();

        System.out.print("Digite o raio: ");
        raio = scanner.nextDouble();

        pi = 3.141592;

        if (operacao == 1) {
            perimetro = 2 * pi * raio;
            System.out.println("Perímetro: " + perimetro);
        } else if (operacao == 2) {
            area = pi * raio * raio;
            System.out.println("Área: " + area);
        } else if (operacao == 3) {
            volume = (4.0 / 3.0) * pi * Math.pow(raio, 3);
            System.out.println("Volume: " + volume);
        } else {
            System.out.println("Código de operação inválido.");
        }

        scanner.close();
    }
}