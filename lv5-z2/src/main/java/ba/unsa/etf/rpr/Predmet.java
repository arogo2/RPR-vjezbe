package ba.unsa.etf.rpr;
import java.util.ArrayList;
import java.util.List;
public class Predmet implements MozeSePredstaviti, MozeOcijeniti {
    private String naziv;
    private String opisPredmeta;
    private List<Ocjena> ocjene;
    public Predmet(String naziv, String opisPredmeta) {
        this.naziv = naziv;
        this.opisPredmeta = opisPredmeta;
        this.ocjene = new ArrayList<>();
    }
    public String getNaziv() {
        return naziv;
    }
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public String getOpisPredmeta() {
        return opisPredmeta;
    }
    public void setOpisPredmeta(String opisPredmeta) {
        this.opisPredmeta = opisPredmeta;
    }
    public List<Ocjena> getOcjene() {
        return ocjene;
    }
    public void setOcjene(List<Ocjena> ocjene) {
        this.ocjene = ocjene;
    }
    @Override
    public String predstavi() {
        return "Naziv: " + getNaziv() + ", Opis predmeta: " + getOpisPredmeta();
    }
    @Override
    public void ocijeni(int x) {
    }
}