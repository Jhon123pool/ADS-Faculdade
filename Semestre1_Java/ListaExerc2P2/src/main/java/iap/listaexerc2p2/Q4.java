package iap.listaexerc2p2;

// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

/** 
 * Questão 4: Peça ao usuário para digitar uma senha até 5 vezes (já que é pra contar até
 * 5, use uma estrutura for). Se acertar, exiba "Acesso permitido" e interrompa o laço com
 * break. Se errar todas, exiba "Acesso negado". 
 */
public class Q4 {
    public static void main(String[] args) {

        // Cria um objeto scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Enquanto 'i' for menor ou igual a 5 o laço será executado e o contador será aumentado em 1.
        for (int i = 1; i <=5; i++) {  
            // Pede ao usuário que digite a senha e guarda a resposta dele na variável 'senha'.
            System.out.print("Digite a senha: ");
            int senha = entrada.nextInt();

            /**
             * Se a senha for igual a 1234, uma mensagem de "Acesso permitido" é exibida.
             * Caso o usuário erre a senha 5 vezes (esgotando a quantidade de tentativas)
             * uma mensagem de "Acesso negado" é exibida.
             */
            if (senha == 1234) {
                System.out.println("Acesso permitido");
                break;
            } else if (i == 5) {
                System.out.println("Acesso negado");
            }  
        }
        
        // Fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }
}