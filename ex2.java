import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ValorCompra, ValorPago, troco;

        System.out.println("Informe o valor da compra");
        ValorCompra = scanner.nextDouble();

        System.out.println("Informe o valor pago");
        ValorPago = scanner.nextDouble();

        troco = ValorPago - ValorCompra;

        if (ValorPago < ValorCompra) {
            System.out.println("Valor insuficiente");
        }

        else {

            System.out.println("O seu troco é de: R$ " + troco);

            int notas50 = (int) (troco / 50);
            troco %= 50;

            int notas20 = (int) (troco / 20);
            troco %= 20;

            int notas10 = (int) (troco / 10);
            troco %= 10;

            int notas5 = (int) (troco / 5);
            troco %= 5;

            int notas2 = (int) (troco / 2);
            troco %= 2;

            int notas1 = (int) troco;

            System.out.println("Notas de R$ 50,00: " + notas50);
            System.out.println("Notas de R$ 20,00: " + notas20);
            System.out.println("Notas de R$ 10,00: " + notas10);
            System.out.println("Notas de R$ 5,00: " + notas5);
            System.out.println("Notas de R$ 2,00: " + notas2);
            System.out.println("Notas de R$ 1,00: " + notas1);

            scanner.close();
        }
    }
}