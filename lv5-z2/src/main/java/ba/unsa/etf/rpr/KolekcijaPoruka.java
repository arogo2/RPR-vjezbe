package ba.unsa.etf.rpr;
import java.util.ArrayList;
import java.util.List;
public class KolekcijaPoruka implements MozeSePredstaviti{
    private final List<String> poruke;
    public KolekcijaPoruka (List<MozeSePredstaviti>poruke) {
        this.poruke = new ArrayList<>();
        for (MozeSePredstaviti x : poruke) {
            if (x instanceof MozeOcijeniti) {
                this.poruke.add(x.predstavi());
            }
        }
    }
    public List<String> getPoruke() {
        return poruke;
    }
    @Override
    public String predstavi() {
        return null;
    }
}