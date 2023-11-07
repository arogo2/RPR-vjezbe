package rpr;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.mockito.Mockito;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class ImenikTest {
    private static Imenik imenik = new Imenik();
    @BeforeAll
    public static void setUp() throws BrojException {
        imenik.dodaj("Eldar", new FiksniBroj(Grad.SARAJEVO, "225-883"));
        imenik.dodaj("Alma", new FiksniBroj(Grad.ZENICA, "22-883"));
        imenik.dodaj("Amir", new MobilniBroj(61, "225-883"));
        imenik.dodaj("Chris", new MedunarodniBroj("+44", "7768878794"));
    }

    @Test
    public void testMockExternal(){
        Imenik i = Mockito.mock(Imenik.class);
        Mockito.when(i.dajBroj("Eldar")).thenReturn("Nema nista");
        String test = i.dajBroj("Eldar");
        assertEquals(test, "Nema nista");
    }

    @Test
    public void testMockInternal() throws BrojException {
        Map<String, TelefonskiBroj> mapa = Mockito.mock(Map.class);
        Mockito.when(mapa.get("Eldar")).thenReturn(new FiksniBroj(Grad.SARAJEVO, "225-883"));
        imenik.setBrojevi(mapa);
        String br = imenik.dajBroj("Eldar");
        assertNotEquals(br, "033/225-883");
        assertEquals(br, "036/225-883");
    }

    @Test
    public void dajBrojFound(){
        String broj = imenik.dajBroj("Eldar");
        assertEquals(broj, "033/225-883");
    }

    @Test
    public void dajBrojNotFound(){
        String broj = imenik.dajBroj("Eldaron");
        assertNull(broj);
    }

    @Test
    public void dodajTestPositive(){
        TelefonskiBroj br = new MobilniBroj(61, "507-855");
        imenik.dodaj("Hamo", br);
        String brojStr = imenik.dajBroj("Hamo");
        assertEquals(brojStr, "061/507-855");
    }

    @Test
    public void dodajFiksniException(){
        assertThrows(BrojException.class,
                new Executable() {
                    @Override
                    public void execute() throws Throwable {
                        new FiksniBroj(null, "123-123");
                    }
                });
        assertThrows(BrojException.class, () -> {new FiksniBroj(null, "123-123");});
    }
}