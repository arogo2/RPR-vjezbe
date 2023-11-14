package ba.unsa.etf.rpr;
import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        InformacijeOStudentu student = new InformacijeOStudentu();
        student.setIme("Ajla");
        student.setPrezime("Rogo");
        student.setGodinaStudija("2");
        student.setBrojIndeksa("19149");
        InformacijeONastavniku nastavnik = new InformacijeONastavniku();
        nastavnik.setIme("Emir");
        nastavnik.setPrezime("Mulaomerovic");
        nastavnik.setTitula("prof");
        Predmet predmet = new Predmet();
        KolekcijaPoruka kp = new KolekcijaPoruka(new ArrayList<MozeSePredstaviti>(List.<MozeSePredstaviti>of()));
        List<String> poruke = kp.getPoruke();
        for (String poruka : poruke) {
            System.out.println(poruka);
        }
    }
}