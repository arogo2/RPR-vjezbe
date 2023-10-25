import java.util.Scanner;

public class Main {
    public static int Faktorijel (int broj){
        int faktorijel = 1;
        for (int i=2; i<=broj; i++){
            faktorijel = faktorijel * i;
        }
        return faktorijel;
    }
    public static double sinus (double broj1){
        return Math.sin(broj1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println ("Unesite broj n: ");
        int broj = input.nextInt();
        int faktorijel = Faktorijel(broj);
        double sinus = sinus(broj);
        System.out.println ("Faktorijel je: " + faktorijel);
        System.out.println ("Sinus je: " + sinus);
    }
}