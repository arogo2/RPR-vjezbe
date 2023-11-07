package org.rpr;
import java.util.*;
import java.util.Objects;
public class FiksniBroj extends TelefonskiBroj{
    public Grad grad;
    public String broj;
    public FiksniBroj (Grad grad, String broj){
        this.grad = grad;
        this.broj = broj;
    }
    @Override
    public String ispisi() {
        return grad.toString() + "/" + broj;
    }
    @Override
    public int hashCode() {
        return Objects.hash(grad, broj);
    }
}