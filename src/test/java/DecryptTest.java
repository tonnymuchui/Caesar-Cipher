import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptTest {

    @Test
    public void decrypt() {
        Decrypt obj= new Decrypt();
        obj.decrypt("cpz",1);
        assertEquals("boy","boy");
    }

    @Test
    public void name() {
    }
}