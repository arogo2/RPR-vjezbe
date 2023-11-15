package ba.unsa.etf.rpr;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        InformacijeOStudentu student = new InformacijeOStudentu("Ajla", "Rogo", "2", "19149");
        InformacijeONastavniku nastavnik = new InformacijeONastavniku("Emir", "Mulaomerovic", "prof");
        Predmet predmet = new Predmet("RPR", "Razvoj programskih rjesenja");
        List<MozeOcijeniti> ocjene = new ArrayList<>();
        KolekcijaPoruka kp = new KolekcijaPoruka(new ArrayList<>(List.of(student, nastavnik, predmet)));
        List<String> poruke = kp.getPoruke();
        for (String poruka : kp.getPoruke()) {
            System.out.println(poruka);
        }
        System.out.println("Unesi ocjenu za predmet: ");
        int ocjenaPredmet = scanner.nextInt();
        student.ocijeni(ocjenaPredmet);
        System.out.println("Unesite ocjenu za nastavnika: ");
        int ocjenaNastavnik = scanner.nextInt();
        ((MozeOcijeniti) student).ocijeni(ocjenaNastavnik);
        for (String poruka : kp.getPoruke()) {
            System.out.println(poruka);
        }
    }
}