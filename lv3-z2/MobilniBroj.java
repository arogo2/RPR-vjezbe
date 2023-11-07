package org.rpr;
import java.util.*;
import java.util.Objects;
public class MobilniBroj extends TelefonskiBroj{
    private final int mobilnaMreza;
    private final String broj;
    public MobilniBroj (int mobilnaMreza, String broj){
        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }
    @Override
    public String ispisi() {
        return String.format ("%03d/%s", mobilnaMreza, broj);
    }
    @Override
    public int hashCode() {
        return Objects.hash(mobilnaMreza, broj);
    }
}