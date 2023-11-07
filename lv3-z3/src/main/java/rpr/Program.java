package rpr;
import java.util.*;
public class Program {
    public static void main(String[] args) throws BrojException {
        Imenik imenik = new Imenik();
        imenik.dodaj("Osoba1", new FiksniBroj(Grad.SARAJEVO, "123-456"));
        imenik.dodaj("Osoba2", new MobilniBroj(61, "987-654"));
        imenik.dodaj("Osoba3", new MedunarodniBroj("+387", "789-123"));
        System.out.println("Broj Osoba1: " + imenik.dajBroj("Osoba1"));
        System.out.println("Ime za broj +387/789-123: " + imenik.dajIme(new MedunarodniBroj(" +387", "789-123")));
        System.out.println(new StringBuilder().append("Imena osoba koje pocinju s 'O' : \n").append(imenik.naSlovo('O')).toString());
        System.out.println("Imena iz Sarajeva: ");
        Set<String> imenaSarajevo = imenik.izGrada(Grad.SARAJEVO);
        for (String ime : imenaSarajevo) {
            System.out.println(ime);
        }
        System.out.println("Brojevi iz Sarajeva: ");
        Set<TelefonskiBroj> brojeviSarajevo = imenik.izGradaBrojevi(Grad.SARAJEVO);
        for (TelefonskiBroj broj : brojeviSarajevo) {
            System.out.println(broj.ispisi());
        }
    }
}