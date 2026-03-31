package iap.lab5semaforo;

// Importa o Scanner, ferramenta que lê o imput do usuário.
import java.util.Scanner;

public class Lab5Semaforo {
    public static void main(String[] args) {

        // Cria um objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Dá as boas vindas ao usuário e pede para que o usuário escolha uma cor para executar uma ação.
        System.out.println("Seja bem vindo ao  controle do semáforo!");
        System.out.println("Escolha uma cor para executar uma ação: \nVermelho = Parar; \nAmarelo = Atenção; \nVerde = Seguir.");
        
        /** 
         * Lê o input do usuário, em seguida converte a resposta dele para maiúsculas e armazena 
         * a resposta modificada na variável 'cor'.
         * */ 
        String cor = entrada.next();
        cor = cor.toUpperCase();
        
        /** Verifica se a resposta do usuário corresponde a uma das 3 opções dadas anteriormente,
         * caso positivo -> exibe a açao escolhida pelo usuário;
         * caso negativo -> exibe uma mensagem de erro.
         */
        switch (cor) {
            case "VERMELHO":
                System.out.println("Parar");
                break;
            case "AMARELO":
                System.out.println("Atenção");
                break;
            case "VERDE":
                System.out.println("Seguir");
                break;
            default :
                System.out.println("ERRO! " + cor + " não é uma opção válida.");            
        }

        // Fecha o Scanner e para de ler o input do usuário.
        entrada.close();
    }
}
