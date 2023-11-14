package ba.unsa.etf.rpr;
import java.util.ArrayList;
import java.util.List;
public class KolekcijaPoruka implements MozeSePredstaviti{
    private final List<String> poruke;
    public List<String> getPoruke() {
        return poruke;
    }
    public KolekcijaPoruka (List<MozeSePredstaviti>poruke) {
        this.poruke = new ArrayList<>();
        for (MozeSePredstaviti x : poruke) {
            this.poruke.add(x.predstavi());
        }
    }
    @Override
    public String predstavi() {
        return null;
    }
}