package iaptreino1;

import java.util.Random;

public class Treino1 {
    public static void main(String[] args) {

        Random rand = new Random();
        
        int[] X = new int[10];

        for (int i=0; i<10; i++) {
            X[i] = rand.nextInt(100) + 1;
        }

        System.out.println("IMPRIMINDO O VETOR X:");
        for (int p = 0; p<10; p++) {
            System.out.print(X[p] + " ");
        }

        int[] Y = new int[10];

        for (int j = 0; j<10; j++) {
            Y[j] = X[j] + j;
        }

        System.out.println("");

        System.out.println("IMPRIMINDO O VETOR Y:");
        for (int b = 0; b<10; b++) {
            System.out.print(Y[b] + " ");
        }


    }
}