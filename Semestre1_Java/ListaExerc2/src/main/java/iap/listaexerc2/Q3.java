package iap.listaexerc2;

// Importa o Scanner, que lê o inpyut do usuário.
import java.util.Scanner;

// Importa o Locale, que reconhece o ponto (.) como separador decimal.
import java.util.Locale;

/** 
 * Faça um programa que leia e valide as seguintes informações: 
 * (a) Nome: maior que 3 caracteres; 
 * (b) Idade: de 0 a 150; 
 * (c) Salário: maior que zero; 
 * (d) Estado Civil: 's', 'c', 'v', 'd', 'u'; 
 * Lembre que se letra é um char que guarda uma letra minúscula ou maiúscula, após o comando  
 * letra = Character.toUpperCase(letra); 
 * letra conterá uma letra maiúscula – a mesma, se já era uma maiúscula; 
 * ou a maiúscula correspondente, se era minúscula. 
 */
public class Q3 {
    public static void main(String[] args) {
        
        /**
         * Cria um objeto Scanner chamado 'entrada' e configura o Locale pro padrão americano
         * que reconhece o ponto (.) como separador decimal.
         */
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        // Pede o nome do usuário e guardaa resposta dele na variável 'nome'.
        System.out.print("Digite o seu nome (note que ele deve ser maior que 3 caracteres): ");
        String nome = entrada.nextLine();

        /** 
         * Valida se o nome guardado em 'nome' é maior que 3 caracteres, 
         * caso negativo pede que o usuário tente novamente.
         */
        while (nome.length() <= 3) {
            System.out.print("Nome inválido! O seu nome deve ser maior que 3 caracteres.\nTente novamente: ");
            nome = entrada.nextLine();
        }

        // Pede a idade do usuário e guarda a resposta dele na variável 'idade'.
        System.out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();

        /** 
         * Valida se a idade do usuário está entre 0 e 150 anos, caso negativo alerta o usuário
         * e pede que ele tente novamente.
         */
        while (idade < 0 || idade > 150) {
            System.out.print("Idade inválida! Você deve ter entre 0 e 150 anos.\nTente novamente: ");
            idade = entrada.nextInt();
        }

        // Pede o valor do salário do usuário e guarda a resposta dele na variável 'salario'.
        System.out.print("Digite o valor do seu salário (não use ponto ou vírgula): ");
        int salario = entrada.nextInt();

        /** 
         * Verifica se o valor digitado pelo usuário é maior que zero, caso negaivo alerta
         * o usuário e pede que ele tente novamente.
         */
        while (salario <= 0) {
            System.out.print("Valor inválido! O valor do seu salário deve ser maior que 0 (zero).\nTente novamente: ");
            salario = entrada.nextInt();
        }

        // Cria a váriável char 'letra'.
        char letra;

        // Cria a String 'letra2'.
        String letra2;
        
        // Pede o Estado Civil do usuário e guarda a resposta (só a primeira letra) dele na variável 'letra'.
        System.out.print("Qual o seu Estado Civil?\n(s) = Solteiro(a);\n(c) = Casado(a);\n(v) = Viúvo(a);\n(d) = Divorciado(a);\n(u) = União Estável;\nDigite só a primeira letra: ");
        letra = entrada.next().charAt(0);

        // Muda a letra armazenada em 'letra' para maiúscula.
        letra = Character.toUpperCase(letra);

        /**
         * Valida se a opção escolhida pelo usuário é uma opção válida, caso negativo alerta o
         * usuário e pede para que ele tente novamente.
         */
        while (letra != 'S' && letra != 'C' && letra != 'V' && letra != 'D' && letra != 'U') {
            System.out.print("Opção inválida! Escolha entre uma das seguintes opções:\n(s) = Solteiro(a);\n(c) = Casado(a);\n(v) = Viúvo(a);\n(d) = Divorciado(a);\n(u) = União Estável.\nDigite só a primeira letra: ");
            letra = entrada.next().charAt(0);

            // Muda a letra armazenada em 'letra' para maiúscula.
            letra = Character.toUpperCase(letra);
        }

        /**
         * Aqui já é enfeite meu, é só pra complementar o meu resumo final sobre o usuário.
         * Caso o usuário escolha uma opção válida para o Estado Civil, o estado correspondente
         * à opção escolhida é adicionado à variável 'letra2', que será utilizada no resumo final
         * sobre o usuário.
         */
        switch (letra) {
            case 'S':
                letra2 = "Solteiro(a).";
                break;
            case 'C':
                letra2 = "Casado(a).";
                break;
            case 'V':
                letra2 = "Viúvo(a).";
                break;
            case 'D':
                letra2 = "Divorciado(a).";
                break;
            case 'U':
                letra2 = "em uma União Estável.";
                break;
            default:
                letra2 = "(Estado Civil não informado).";
                break;                  
        }

        /** 
         * Imprime um resumo sobre o usuário contendo os dados coletados durante a execução
         * do programa.
         */
        System.out.printf("Resumo sobre você:\nSeu nome é %s, você tem %d anos, seu salário está no valor de R$%d, e você está %s", nome, idade, salario, letra2);

        // Fecha o Scanner, que deixa de ler o input do usuário.
        entrada.close();
    }
}