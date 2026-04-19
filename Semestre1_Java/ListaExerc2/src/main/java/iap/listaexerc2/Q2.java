package iap.listaexerc2;

// Importa o Scanner, que lê o inpyut do usuário.
import java.util.Scanner;

/** 
 * Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário
 * mostrando uma mensagem de erro e voltando a pedir as informações.
 * Lembre que, para duas strings palavra1 e palavra2, palavra1.equals(palavra2) retorna true, 
 * se as strings são iguais, e false, caso contrário. 
 */
public class Q2 {
    public static void main(String[] args) {
        
        // Cria um objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        // Pede o nome de usuário e guarda a resposta do usuário na variável 'palavra1'.
        System.out.print("Digite o seu nome de usuário: ");
        String palavra1 = entrada.nextLine();

        // Pede a senha do usuário e guarda a resposta dele na variável 'palavra2'.
        System.out.print("Digite a sua senha: ");
        String palavra2 = entrada.nextLine();

        /**
         * Verifica se a senha armazenada em 'palavra2' é igual ao nome de usuário armazenado em 'palavra1',
         * caso positivo retorna uma mensagem de erro e pede para o usuário inserir os dados novamente.
         */
        while (palavra1.equals(palavra2)) {
            System.out.println("Sua senha não pode ser igual ao seu nome de usuário. \nTente novamente.");
            System.out.print("Digite o seu nome de usuário: ");
            palavra1 = entrada.nextLine();
            System.out.print("Digite a sua senha: ");
            palavra2 = entrada.nextLine();
        }

        if (!palavra2.equals(palavra1)) {
            System.out.println("Seja bem vindo, " + palavra1 + "!");
        }

        // Fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }
}