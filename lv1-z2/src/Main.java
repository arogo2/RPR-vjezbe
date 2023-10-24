// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Unesite broj: ");
        int broj;
        broj = input.nextInt();
        for (int i = 1; i<broj; i++){
            if (BrojDjeljivSaSumomCifara(i)){
                System.out.println(i);
            }
        }
    }
    private static boolean BrojDjeljivSaSumomCifara (int broj){
        int suma = SumaCifara(broj);
        return broj % suma == 0;
    }
    private static int SumaCifara (int broj1) {
        int suma = 0;
        while (broj1 != 0) {
            suma += (broj1 % 10);
            broj1 = broj1 / 10;
        }
        return suma;
    }
}