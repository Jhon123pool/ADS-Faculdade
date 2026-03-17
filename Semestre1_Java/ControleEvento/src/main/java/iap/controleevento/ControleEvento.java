package iap.controleevento;

// Importa o Scanner, que vai ler a os dados que o usuário inserir.
import java.util.Scanner; 

public class ControleEvento {
    public static void main(String[] args) {

        // Define uma nova classe para o Scanner chamada de entrada.
        Scanner entrada = new Scanner(System.in); 

        // Pergunta a idade do usuário e guarda a resposta do usuário na variável 'idade'.
        System.out.println("Qual a sua idade? ");
        int idade = entrada.nextInt (); 
        
        // Exibe uma mensagem que pergunta ao usuário se ele possui ingresso.
        System.out.println("Você possui um ingresso? (Sim/Não)"); 

        // Guarda a resposta dele na variável 'ingresso'.
        String ingresso = entrada.next();
        boolean possuiIngresso;

        // Aqui a resposta do usuário é convertida para um valor lógico.
        if (ingresso.equalsIgnoreCase("Sim")) { 
            possuiIngresso = true;
        } else {
            possuiIngresso = false;
        }

        // Exibe uma mensagem que pergunta ao usuário se ele está acompanhado de um responsável e armazena a resposta na string 'responsavel'.
        System.out.println("Você está acompanhado de um responsável? (Sim/Não)");
        String responsavel = entrada.next();
        boolean acompanhadoResponsavel;

        // Aqui a resposta do usuário é convertida para um valor lógico.
        if (responsavel.equalsIgnoreCase("Sim")) {
            acompanhadoResponsavel = true;
        } else {
            acompanhadoResponsavel = false;
        }

        // Exibe uma mensagem que pergunta ao usuário se ele está banido e armazena a resposta dele na string 'ban'.
        System.out.println("Você está banido? (Sim/Não)");
        String ban = entrada.next();
        boolean banido;

        // Aqui a resposta do usuário é convertida para um valor lógico.
        if (ban.equalsIgnoreCase("Não")) {
            banido = false;
        } else {
            banido = true;
        }

        // Verifica se o usuário atende aos pré-requisitos para entrar no evento e exibe a resposta pro usuário.
        boolean podeEntrar = (idade >= 18 || (idade < 18 && acompanhadoResponsavel)) && possuiIngresso && !banido;
        if (podeEntrar) {
            System.out.println("Bem-vindo ao evento!");
        } else {
            System.out.println("Desculpe, você não pode entrar.");
        }
        // Fecha o Scanner.
        entrada.close();
    }
}
