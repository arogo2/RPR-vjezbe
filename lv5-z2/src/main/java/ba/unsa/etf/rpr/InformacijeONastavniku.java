package ba.unsa.etf.rpr;
import java.util.List;
import java.util.ArrayList;
public class InformacijeONastavniku extends LicneInformacije implements MozeSePredstaviti, MozeOcijeniti {
    private String titula;
    private List<Ocjena> ocjene;
    public InformacijeONastavniku(String ime, String prezime, String titula) {
        super(ime, prezime);
        this.titula = titula;
        this.ocjene = new ArrayList<>();
    }
    public String getTitula() {
        return titula;
    }
    public void setTitula(String titula) {
        this.titula = titula;
    }
    public List<Ocjena> getOcjene() {
        return ocjene;
    }
    public void setOcjene(List<Ocjena> ocjene) {
        this.ocjene = ocjene;
    }
    @Override
    public String predstavi() {
        return "Ime: " + getIme() + ", Prezime: " + getPrezime() + ", Titula: " + getTitula();
    }
    @Override
    public void ocijeni(int x) {
    }
}