package rpr;
import rpr.FiksniBroj;
import rpr.Grad;
import rpr.TelefonskiBroj;
import java.util.*;
public class Imenik {
    private final Map<String, TelefonskiBroj> imenik = new HashMap<>();
    public void dodaj(String ime, TelefonskiBroj broj) {
        imenik.put(ime, broj);
    }
    public String dajBroj(String ime) {
        TelefonskiBroj broj = imenik.get(ime);
        return (broj != null) ? broj.ispisi() : "Nema tog imena u imeniku.";
    }
    public String dajIme(TelefonskiBroj broj) {
        for (Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
            if (entry.getValue().ispisi().equals(broj.ispisi()))
                return entry.getKey();
        }
        return "Nema tog broja u imeniku.";
    }
    public String naSlovo(char s) {
        StringBuilder rezultat = new StringBuilder();
        int brojac = 1;
        for (Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
            if (entry.getKey().charAt(0) == s) {
                rezultat.append(brojac)
                        .append(" - ")
                        .append(entry.getKey())
                        .append(" - ")
                        .append(entry.getValue().ispisi())
                        .append("\n");
            }
            brojac++;
        }
        return rezultat.toString();
    }
    public Set<String> izGrada(Grad g) {
        Set<String> imenaIzGrada = new TreeSet<String>();
        for (Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet())
            if (entry.getValue() instanceof FiksniBroj fiksniBroj) {
                if (fiksniBroj.grad.equals(g)) {
                    imenaIzGrada.add(entry.getKey());
                }
            }
        return imenaIzGrada;
    }
    public Set<TelefonskiBroj> izGradaBrojevi(Grad g) {
        Set<TelefonskiBroj> brojeviIzGrada = new TreeSet<>(Comparator.comparing(TelefonskiBroj::ispisi));
        for (Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
            if (entry.getValue() instanceof FiksniBroj) {
                FiksniBroj fiksniBroj = (FiksniBroj) entry.getValue();
                if (fiksniBroj.grad == g) {
                    brojeviIzGrada.add(fiksniBroj);
                }
            }
        }
        return brojeviIzGrada;
    }
//    public String dajIme(TelefonskiBroj broj) {
//        for (Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
//            if (entry.getValue().equals(broj)) {
//                return entry.getKey();
//            }
//        }
//        return "Nema tog broja u imeniku.";
//    }
//    public String naSlovo(char s) {
//        StringBuilder rezultat = new StringBuilder();
//        for (Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
//            if (entry.getKey().charAt(0) == s) {
//                rezultat.append(entry.getKey()).append(" - ").append(entry.getValue().ispisi()).append("\n");
//            }
//        }
//        return rezultat.toString();
//    }
//    public Set<String> izGrada(Grad g) {
//        Set<String> imenaIzGrada = new TreeSet<>();
//        for (Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
//            if (entry.getValue() instanceof FiksniBroj fiksniBroj) {
//                if (fiksniBroj.grad.equals(g)) {
//                    imenaIzGrada.add(entry.getKey());
//                }
//            }
//        }
//        return imenaIzGrada;
//    }
//    public Set<TelefonskiBroj> izGradaBrojevi(Grad g) {
//        Set<TelefonskiBroj> brojeviIzGrada = new TreeSet<>(Comparator.comparing(TelefonskiBroj::ispisi));
//        for (Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
//            if (entry.getValue() instanceof FiksniBroj) {
//                FiksniBroj fiksniBroj = (FiksniBroj) entry.getValue();
//                if (fiksniBroj.grad == g) {
//                    brojeviIzGrada.add(fiksniBroj);
//                }
//            }
//        }
//        return brojeviIzGrada;
//    }
}