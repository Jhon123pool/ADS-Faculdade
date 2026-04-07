package iap.listaexerc1p2;

// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

/** 
 * Questão 3.C: Em uma determinada escola a avaliação das provas é dava por conceito, 
 * de acordo com a pontuação obtida: 
 * • A: 90 a 100 pontos 
 * • B: 70 a 89 pontos 
 * • C: 50 a 69 pontos 
 * • D: 30 a 49 pontos 
 * • E: 0 a 29 pontos
 * Faça um programa que receba o número de pontos de um candidato e imprima o seu conceito.
 */ 
public class QC3 {
    public static void main(String [] args) {

        // Cria um objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Pede a pontuação do usuário e guarda a resposta dele na variável 'nota'.
        System.out.print("Digite a sua pontuação (de 0 a 100): ");
        int nota = entrada.nextInt();

        /** 
         * Divide a nota do usuário por 10 para ter como resultado um número de 1 a 10. 
         * A estrutura switch não aceita intervalos então precisamos de valores exatos.
         */
        int con = nota / 10;

        /** Verifica se o número armazenado na variável 'nota' corresponde a uma das 10 opções disponíveis
         * e retorna uma mensagem mostrando o a nota conceito do usuário ou retorna uma mensagem de nota 
         * inválida caso o usuário insira um número que não se encaixa nas opções.
         */
        switch (con) {
            case 10:
            case 9:
                System.out.println("Conceito: A");
                break;
            case 8:
            case 7:
                System.out.println("Conceito: B");
                break;
            case 6:
            case 5:
                System.out.println("Conceito: C");
                break;
            case 4:
            case 3:
                System.out.println("Conceito: D");
                break;
            case 2:
            case 1:
            case 0:
                System.out.println("Conceito: E");
                break;                   
            default :
                System.out.println(nota + " não é uma nota válida"); 
        }

        // Fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }
}