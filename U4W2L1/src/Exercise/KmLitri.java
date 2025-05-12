package Exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KmLitri {
    public static void main(String[] args) {

        /* -------------- KM/Litri con Int ------------ */

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("insierisci i Km: ");
            int Km = scanner.nextInt();

            System.out.println("insierisci i litri: ");
            int litri = scanner.nextInt();

            int divsione = Km / litri;
            System.out.println(divsione);

        }catch (InputMismatchException i) { //InputMismatchException solo se non è lo stesso type
            System.out.println("Non puoi inserire lettere");
        } catch (ArithmeticException e) { //ArithmeticException se è dello stesso type
            System.out.println("Non puoi inserire 0");
        }

        System.out.println("operazione conclusa!");


        /* -------------- KM/Litri con Double ------------ */

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("insierisci i Km: ");
        double Km = scanner.nextDouble();

            System.out.println("insierisci i litri: ");
        double litri = scanner.nextDouble();

        double divsione = Km / litri;
            System.out.println(divsione);

            if (Km == 0 || litri == 0) {
                System.out.println("non puoi darmi 0");
            }

        }catch (InputMismatchException i) {
            System.out.println("Non puoi inserire lettere");
        }
    }
}
