package iap.listaexerc1;

// Importa a ferramenta Scanner, que lê o input do usuário.
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        // Cria um novo objeto Scanner chamado 'entrada'.
        Scanner entrada = new Scanner(System.in);

        /** 
         * Pergunta ao usuário se ele possui o nome de usuário correto e armazena a resposta dele
         * como valor lógico na variável booleana chamada 'usuarioCorreto'.
         */
        System. out.print("Você possui o nome de usuário correto para entrar na sua conta? (Digite 'true' para sim ou 'false' para não.) ");
        boolean usuarioCorreto = entrada.nextBoolean();

        /** 
         * Pergunta ao usuário se ele possui a senha correta e armazena a resposta dele
         * como valor lógico na variável booleana chamada 'senhaCorreta'.
         */
        System. out.print("Você possui a senha correta para entrar na sua conta? (Digite 'true' para sim ou 'false' para não.) ");
        boolean senhaCorreta = entrada.nextBoolean();

        /** 
         * Verifica se os valores guardados nas variáveis 'usuárioCorreto' e 'senhaCorreta'
         * são verdadeiros, caso ambas sejam verdadeiras (true) guarda o valor lógico 'true' 
         * na variável 'acessoPermitido' e caso alguma delas seja falsa (false) guarda o 
         * valor lógico 'false' na variável 'acessoPermitido'.
         */
        boolean acessoPermitido = usuarioCorreto && senhaCorreta;

        /** 
         * Exibe o resultado da comparação booleana para o usuário em forma de valor lógico
         * sendo 'true' para verdadeiro e 'false' para falso.
         */
        System.out.println("Você pode entrar? " + acessoPermitido);

        // Fecha o Scanner, o que é uma boa prática e evita o vazamento de memória.
        entrada.close();
    }
}