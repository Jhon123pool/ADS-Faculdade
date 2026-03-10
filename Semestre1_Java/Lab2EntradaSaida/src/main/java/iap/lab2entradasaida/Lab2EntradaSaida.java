package iap.lab2entradasaida;
import java.util.Scanner; /* A ferramenta Scanner deve ser importada no início
                           * do código, antes do método main, ela serve para
                           * ler a entrada (teclado) do usuário. */

public class Lab2EntradaSaida {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); /* Aqui a gente define onde o
                                                    * Scanner vai buscar os dados
                                                    * de entrada do usuário. */

        System.out.println("Digite um número inteiro: ");
        int numeroInteiro = entrada.nextInt (); /* Aqui a gente define uma caixa onde
                                                 * um número inteiro digitado pelo
                                                 * usuário será armazenado. */
        System.out.println("Digite outro número inteiro: ");
        int numeroInteiro2 = entrada.nextInt ();
        int soma = numeroInteiro + numeroInteiro2; /* Aqui a gente define mais uma
                                                    * caixa e atribuímos uma 
                                                    * operação de soma com os números
                                                    * armazenados anteriormente. */

        System.out.printf("Resultado: %d", soma); /* Por fim, aqui nós exibimos o
                                                   * resultado da operção de soma entre
                                                   * os dois números que foram armazenados
                                                   * e somados na terceira caixa utilizando
                                                   * o printf e o %d que preparam saída para
                                                   * exibir números. */
    }
}
