package iap.lab10bubblesort;

public class Lab10BubbleSort {
    public static void main(String[] args) {

        // (1.1b) Crie um vetor int a[] com os seguintes valores: {45, 42, 37, 32, 28, 21, 19, 13, 8, 2}.
        //int a[] = {45, 42, 37, 32, 28, 21, 19, 13, 8, 2};

        /**
         * (1.2) Comente a linha de criação do vetor a[] e repita os passos do item 1.1 
         * para um novo vetor int a[] = {2, 8 , 13, 19, 21, 28, 32, 37,42, 45}.
         */
        int a[] = {2, 8 , 13, 19, 21, 28, 32, 37,42, 45};

        int n = a.length;

        /**
         * (1.1a) Inclua um contador antes do se (linha 3) para contar quantas comparações 
         * são realizadas durante a execução.
         */
        int comparacoes = 0;

        /**
         * Imprime o vetor original com ajuda da firula que eu estava testando (já que
         * funcionou no outro código (Q5 da lista 2p3), a essa altura já é feature).
         */
        System.out.println("Vetor original:");
        imprimir(a);

        // (1.1d) Submeta a[] ao Bubble Sort
        for (int pass = 1; pass <= n - 1; pass++) {

            // Onde o laço externo controla as passagens e o laço interno percorre o vetor.
            for (int i = 0; i <= n - 2; i++) {
                comparacoes++;

                // Onde eu continuo o raciocínio da 1.1a, a conta ficou antes do 'if' que veio do pseudocódigo.
                if (a[i] > a[i + 1]) {

                    // Realiza a troca dos elementos (permuta) com a ajuda de uma variável auxiliar 'temp'.
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }

        /**
         * Imprime o vetor ordenado com ajuda da firula (tenho que procurar o nome correto 
         * desse método).
         */
        System.out.println("\nVetor ordenado:");
        imprimir(a);

        // (1.1f) Imprima o número de comparações efetuadas. 
        System.out.println("\nTotal de comparações: " + comparacoes);
    }

    public static void imprimir(int[]v) {
        for (int i : v)
        System.out.print(i + " ");
        System.out.println();
    }
}

/**
 * (1.3) Quantas comparações são efetuadas na primeira execução, em que os dados estão organizados, inicialmente, em ordem decrescente? Por que?
 * 
 * R: Foram executadas 81 comparações. Isso aconteceu porque no pseudocódigo do exemplo 1, 
 * o número de comparações é fixo. Já que o vetor tem 10 elementos, o algoritmo realiza 
 * n-1 (logo 9) passagens, e em cada passagem ele faz n-1 (9) comparações. Logo, temos 
 * 9*9=81. Outro detalhe é que este é o pior caso, já que o maior elemento estava 
 * localizado no primeiro índice, logo todos os elementos precisaram ser trocados.
 *
 * 
 * (1.4) Quantas comparações são efetuadas na primeira execução, em que os dados estão 
 * organizados, inicialmente, em ordem crescente? Por que?
 * 
 * R: Também foram executadas 81 comparações. Isso aconteceu porque o pseudocódigo do 
 * exemplo 1 não possui uma verificação (flag) para saber se o vetor já está ordenado. Ele 
 * simplesmente executa os laços for até o final, comparando todos os pares em todas as 
 * passagens, mesmo sem ter que realizar uma troca.
 *
 * 
 * (1.5) Você acha que é possível implementar alterações para melhorar o desempenho do 
 * algoritmo, inclusive, de acordo com a organização inicial dos dados? Não precisa 
 * implementar, apenas explique, com suas palavras, o que você acha que pode ser melhorado 
 * e como.
 * 
 * R: Sim, é possível, através de uma verificação booleana (flag), que sinaliza se uma 
 * troca foi efetuada (ou permanece false se nenhuma troca foi efetuada) e caso negativo 
 * sai daquele laço (break) mostrando que o vetor já está organizado e evitando passagens 
 * e comparações desnecessárias.
 */