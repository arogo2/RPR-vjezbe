package ba.unsa.etf.rpr;
public class InformacijeOStudentu extends LicneInformacije implements MozeSePredstaviti{
    private String ime;
    private String prezime;
    private String godinaStudija = "";
    private String brojIndeksa = "";
    public InformacijeOStudentu(String ime, String prezime, String godinaStudija, String brojIndeksa) {
        super(ime, prezime);
        this.godinaStudija = godinaStudija;
        this.brojIndeksa = brojIndeksa;
    }
    public InformacijeOStudentu() {
        super(null, null);
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
    @Override
    public String predstavi() {
        return super.predstavi() + ", Godina studija: " + getGodinaStudija() + ", Broj indexa: " + getBrojIndeksa();
    }
}