package ba.unsa.etf.rpr;
public class Predmet implements MozeSePredstaviti{
    private String naziv;
    private String opisPredmeta;
    public Predmet(String naziv, String opisPredmeta) {
        this.naziv = naziv;
        this.opisPredmeta = opisPredmeta;
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
    @Override
    public String predstavi() {
        return "Naziv: " + getNaziv() + ", Opis predmeta: " + getOpisPredmeta();
    }
}