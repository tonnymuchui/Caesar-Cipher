
import org.junit.Test;

import static org.junit.Assert.*;

public class CeasarCipher {

    @Test
    public void encrypt() {
        CeasarCipher obj = new CeasarCipher();
        obj.encrypt("boy",1);
        assertEquals("cpz","boy");
    }
}
