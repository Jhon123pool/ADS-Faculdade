package iap.lab6controlesenha;

// Importa o Scanner, que lê o input do usuário.
import java.util.Scanner;

public class Lab6ControleSenha {
    public static void main(String[] args) {

        // Cria um objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);
        
        // Pede a senha ao usuário e guarda a resposta dele na variável 'senha'.
        System.out.print("Digite a senha: ");
        String senha = entrada.nextLine();

        // Inicia o contador.
        int contador = 1;

        // Inicia o método 'while' que realiza uma série de ações para validar a senha armazenada na variável 'senha'.
        while (!"c@n@rio".equals(senha) && (contador < 5)) {

            /** 
             * Verifica se o contador atingiu o limite de 4, caso positivo alerta o usuário sobre sua última
             * chance para inserir a senha, caso negativo, mostra a mensagem padrão de "A senha não confere."
             */
            if (contador == 4) {
                System.out.println("A senha não confere. Esta será a sua última chance! Pense bem antes de começar a digitar... \nTente de novo: ");
            } else {
                System.out.print("A senha não confere. Após 5 tentativas o programa será encerrado. \nTente novamente: ");
            }

            // O usuário insere a senha mais uma vez.
            senha = entrada.nextLine();

            // Cada vez que o usuário insere uma senha o contador é aumentado em +1.
            contador = contador + 1;
        }

        // Verifica o resultado de execução do while e mostra uma mensagem de acordo com a situação (true/false).
        if ("c@n@rio".equals(senha)) {
            System.out.println("Senha correta. Seja bem vindo!");
        } else {
            System.out.println("Você digitou a senha errada 5 vezes. \nPrograma encerrado.");
        }

        // Fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }
}
