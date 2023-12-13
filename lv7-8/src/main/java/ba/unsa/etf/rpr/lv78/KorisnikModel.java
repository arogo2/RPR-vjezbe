package ba.unsa.etf.rpr.lv78;
import javafx.beans.Observable;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class KorisnikModel {
    private ObservableList<Korisnik> listaKorisnika;
    SimpleObjectProperty<Korisnik> korisnik;

    public KorisnikModel() {
        listaKorisnika = FXCollections.observableArrayList();
    }

    public ObservableList<Korisnik> getListaKorisnika() {
        return listaKorisnika;
    }

    public void setListaKorisnika(ObservableList<Korisnik> listaKorisnika) {
        this.listaKorisnika = listaKorisnika;
    }

    public Korisnik getKorisnik() {
        return korisnik.get();
    }

    public void setKorisnik(Korisnik k) {
        korisnik.set(k);
    }

    public void napuni(ObservableList<Korisnik> lista) {
        for(int i=0; i<lista.size(); i++) {
            listaKorisnika.add(lista.get(i));
        }
    }
}