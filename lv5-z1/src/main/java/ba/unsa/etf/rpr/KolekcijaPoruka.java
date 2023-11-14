package ba.unsa.etf.rpr;
import java.util.ArrayList;
import java.util.List;
public class KolekcijaPoruka {
    private List<String> poruke;
    public KolekcijaPoruka (List<MozeSePredstaviti>poruke) {
        this.poruke = new ArrayList<>();
        for (MozeSePredstaviti x : poruke) {
            this.poruke.add(x.predstavi());
        }
    }
    public List<String> getPoruke() {
        return poruke;
    }
}