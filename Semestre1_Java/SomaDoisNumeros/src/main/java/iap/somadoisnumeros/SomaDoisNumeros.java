package iap.somadoisnumeros;
import java.util.Scanner;

public class SomaDoisNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System. out.print("Digite o primeiro número inteiro:");
        int numerol = scanner.nextInt();
        System.out.print ("Digite o segundo número inteiro:");
        int numero2 = scanner.nextInt();
        int soma = numerol + numero2;
        System.out.printf("A soma de " + numerol + "e" + numero2, "é" + soma);
    }
}
