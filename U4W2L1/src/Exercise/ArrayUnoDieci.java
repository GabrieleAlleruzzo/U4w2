package Exercise;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayUnoDieci {
    public static void main(String[] args) {

        Random random = new Random();
        int numRand = random.nextInt(10)+1; // genera numeri da 0 a 9, e aggiungendo 1 ottieni valori da 1 a 10

        int[] arrays = new int[5];
        for (int i = 0; i < arrays.length; i++) {
           /* arrays[i] = numRand; da lo stesso numero in tutte le posizioni */
            arrays[i] =  random.nextInt(10)+1;
        }

    System.out.println(Arrays.toString(arrays)); //ho dovuto importare la classe Arrays
        Scanner scanner = new Scanner(System.in);
        



    }
}
