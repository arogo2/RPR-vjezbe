package ba.unsa.etf.rpr;
public class Ocjena {
    private LicneInformacije osoba;
    private int ocjena;
    public LicneInformacije getOsoba() {
        return osoba;
    }
    public void setOsoba(LicneInformacije osoba) {
        this.osoba = osoba;
    }
    public int getOcjena() {
        return ocjena;
    }
    public void setOcjena(int ocjena) throws IllegalAccessException {
        if (ocjena < 0 || ocjena > 10) {
            this.ocjena = ocjena;
        } else {
            throw new IllegalAccessException("Ocjena mora biti izmedju 1 i 9!");
        }
    }
    public Ocjena (LicneInformacije osoba, int ocjena) {
        this.osoba = osoba;
        this.ocjena = ocjena;
    }
}