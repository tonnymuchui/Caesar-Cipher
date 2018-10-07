import org.junit.Test;
import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class CeasarCipherTest{


    @Test
    public void Cipher_testingEncryptingmethod() {
        CeasarCipher cipher =new CeasarCipher();
        assertEquals("nbe",cipher.encrypt("mad",1));
    }

    @Test
    public void Cipher_testingDecryptingMethod() {
        CeasarCipher cipher =new CeasarCipher();
        assertEquals("mad",cipher.decrypt("nbe",1));
    }


}


}