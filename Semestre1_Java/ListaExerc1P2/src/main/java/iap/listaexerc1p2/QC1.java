package iap.listaexerc1p2;

// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

/** 
 * Questão 1.C: Faça um programa que leia um número e exiba o dia correspondente da semana. 
 * (1Domingo, 2- Segunda, etc.), se digitar um valor maior que 7, deve aparecer “valor inválido”. 
 */ 
public class QC1 {
    public static void main(String [] args) {

        // Cria um objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Pede um número entre 1 e 7 ao usuário e guarda a resposta dele na variável 'num'.
        System.out.print("Bem vindo ao menu de seleção diário! \nPara começar, escolha um dia da semana usando um número entre 1 e 7: ");
        int num = entrada.nextInt();

        /** Verifica se o número armazenado na variável 'num' corresponde a uma das 7 opções disponíveis
         * e retorna uma mensagem mostrando a opção escolhida pelo usuário ou uma mensagem de valor inválido
         * caso o usuário insira um número que não se encaixa nas opções.
         */
        switch (num) {
            case 1:
                System.out.println("1-Domingo");
                break;
            case 2:
                System.out.println("2-Segunda");
                break;
            case 3:
                System.out.println("3-Terça");
                break;
            case 4:
                System.out.println("4-Quarta");
                break;
            case 5:
                System.out.println("5-Quinta");
                break;
            case 6:
                System.out.println("6-Sexta");
                break;
            case 7:
                System.out.println("7-Sábado");
                break;
            default :
                System.out.println(num + " é um valor inválido."); 
        }

        // Fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }
}