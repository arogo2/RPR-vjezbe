package ba.unsa.etf.rpr;
import java.util.List;
import java.util.ArrayList;
public class InformacijeOStudentu extends LicneInformacije implements MozeSePredstaviti, MozeOcijeniti {
    private String ime;
    private String prezime;
    private String godinaStudija = "";
    private String brojIndeksa = "";
    private List<Ocjena> ocjene;
    public InformacijeOStudentu(String ime, String prezime, String godinaStudija, String brojIndeksa) {
        super(ime, prezime);
        this.godinaStudija = godinaStudija;
        this.brojIndeksa = brojIndeksa;
        this.ocjene = new ArrayList<>();
    }
    public String getIme() {
        return ime;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public String getGodinaStudija() {
        return godinaStudija;
    }
    public void setGodinaStudija(String godinaStudija) {
        this.godinaStudija = godinaStudija;
    }
    public String getBrojIndeksa() {
        return brojIndeksa;
    }
    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }
    public List<Ocjena> getOcjene() {
        return ocjene;
    }
    public void setOcjene(List<Ocjena> ocjene) {
        this.ocjene = ocjene;
    }
    @Override
    public String predstavi() {
        return super.predstavi() + ", Godina studija: " + getGodinaStudija() + ", Broj indexa: " + getBrojIndeksa();
    }
    @Override
    public void ocijeni(int x) {
    }
}