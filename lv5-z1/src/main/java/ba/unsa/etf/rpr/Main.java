package ba.unsa.etf.rpr;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        InformacijeOStudentu student = new InformacijeOStudentu("Ajla", "Rogo", "2", "19149");
        InformacijeONastavniku nastavnik = new InformacijeONastavniku("Emir", "Mulaomerovic", "prof");
        Predmet predmet = new Predmet("RPR", "Razvoj programskih rjesenja");
        KolekcijaPoruka kp = new KolekcijaPoruka(new ArrayList<>(List.of(student, nastavnik, predmet)));
        List<String> poruke = kp.getPoruke();
        for (String poruka : poruke) {
            System.out.println(poruka);
        }
    }
}