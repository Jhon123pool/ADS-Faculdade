package iap.lab3descontocombustivel;

// Importa o Scanner, que lê o input do usuário e o Locale, que permite o uso das casas decimais.
import java.util.Scanner;
import java.util.Locale;

public class Lab3DescontoCombustivel {
    public static void main(String[] args) {

        // Inicia o leitor de dados do console e define o Locale para o padrão americano (US) que reconhece o ponto (.) como separador decimal.
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        // Dá as boas vindas ao usuário e pergunta o tipo de combistível que ele vai querer, a resposta do usuário fica armazenada na variável char de nome 'tipo'.
        System.out.println("Seja bem-vindo ao Posto Pague Barato, digite o tipo de combustível que você quer: (E para Etanol / G para Gasolina)");
        char tipo = entrada.next().charAt(0);
        double valorDesconto = 0;

        // Verifica o tipo de combustível selecionado pelo usuário.
        if (tipo == 'E' || tipo == 'e') {
            System.out.println("Você selecionou o Etanol, quantos litros voê deseja abastecer? ");
        int litros = entrada.nextInt();

        // Calcula a porcentagem de desconto baseada na quantidade de litros.
        double valorBruto = litros * 5.50;
        if (litros <= 20) {
        valorDesconto = valorBruto * 0.03;
        } else {
            valorDesconto = valorBruto * 0.05;
        }
        // Subtrai o desconto calculado do valor bruto para obter o preço total.
        double valorFinal = valorBruto - valorDesconto;
        System.out.println("Ficou R$" + valorFinal);

        // Verifica o tipo de combustível selecionado pelo usuário.
        } else if (tipo == 'G' || tipo == 'g') {
            System.out.println("Você selecionou a Gasolina, quantos litros voê deseja abastecer? ");
        int litros = entrada.nextInt();

        // Calcula a porcentagem de desconto baseada na quantidade de litros.
        double valorBruto = litros * 6.00;
        if (litros <= 20) {
        valorDesconto = valorBruto * 0.04;
        } else {
            valorDesconto = valorBruto * 0.06;
        }
        // Subtrai o desconto calculado do valor bruto para obter o preço total.
        double valorFinal = valorBruto - valorDesconto;
        System.out.println("Ficou R$" + valorFinal);
        } else {
            System.out.println("Tipo de combustível inválido");
        }

        // Fecha o Scanner.
        entrada.close();
    }
}
