package Esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Dammi numero parole:");
        s.nextLine();

        int N = s.nextInt();

        //qui vanno le collezione di intefacce
        //ste è un'interfaccia
        //hashSet è un'implementazione di set
        Set<String> paroleDist = new HashSet<>();
        Set<String> paroleDupl = new HashSet<>();

        for (int i = 0; i < N; i++) {
            System.out.println("Scrivi " + (i + 1) + " parole");
            String parole = s.nextLine();

            if (!paroleDist.add(parole)) {
                paroleDupl.add(parole);
            }
        }
        System.out.println("Parole duplicate:");
        if (paroleDupl.isEmpty()) {
            System.out.println("Nessuna parola duplicata");
        } else {
            for (String parola : paroleDupl) {
                System.out.println(parola);
            }

            System.out.println("Parole distinte " + paroleDist.size());
            System.out.println("Elenco parole distinte:");
            for (String parola : paroleDist) {
                System.out.println(parola);
            }
            s.close();
        }
    }
}