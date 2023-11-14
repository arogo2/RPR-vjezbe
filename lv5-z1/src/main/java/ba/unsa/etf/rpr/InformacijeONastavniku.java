package ba.unsa.etf.rpr;
public class InformacijeONastavniku extends LicneInformacije{
    private String titula;
    public InformacijeONastavniku(String ime, String prezime){
        super(ime, prezime);
    }
    @Override
    public String predstavi() {
        return super.predstavi();
    }
    public InformacijeONastavniku() {
        super(null, null);
    }
    public String getTitula() {
        return titula;
    }
    public void setTitula(String titula) {
        this.titula = titula;
    }
}
