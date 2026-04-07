package iap.listaexerc1p2;

// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

/** 
 * Questão 2.C: Escreva um programa que, a partir de um mês fornecido (número inteiro de 1 a 12), apresente o nome dele por extenso ou uma mensagem de mês inválido.
 */ 
public class QC2 {
    public static void main(String [] args) {

        // Cria um objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Pede um número entre 1 e 12 ao usuário e guarda a resposta dele na variável 'num'.
        System.out.print("Bem vindo ao calendário! \nPara começar, escolha um mês usando um número entre 1 e 12: ");
        int num = entrada.nextInt();

        /** Verifica se o número armazenado na variável 'num' corresponde a uma das 12 opções disponíveis
         * e retorna uma mensagem mostrando a opção escolhida pelo usuário ou uma mensagem de mês inválido
         * caso o usuário insira um número que não se encaixa nas opções.
         */
        switch (num) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;                    
            default :
                System.out.println(num + " é um mês inválido."); 
        }

        // Fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }
}