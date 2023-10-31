import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner (System.in);
        List<Double> brojevi = new ArrayList<Double>();
        while (true){
            System.out.println("Unesite broj ili rijec stop: ");
            String line = Scanner.nextLine();
            if ("stop".equalsIgnoreCase(line.trim())){
                break;
            }
            try{
                Double broj = Double.parseDouble(line);
                brojevi.add(broj);
            }catch (Exception e){
                System.out.println("Uneseni string nije broj!");
                continue;
            }
        }
        System.out.println("Rezultati: ");
        System.out.println("MIN: " + Z3.min(brojevi));
        System.out.println("MAX: " + Z3.max(brojevi));
        System.out.println("MEAN: " + Z3.mean(brojevi));
        System.out.println("STDEV: " + Z3.standardnaDevijacija(brojevi));
    }
}