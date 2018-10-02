import org.junit.Test;
import static org.junit.Assert.*;
public class CeasarCipherTest{
    @Test
    public void ceasarCipher_encrypt_string(){
        CeasarCipher testCeaserCipher = new CeasarCipher();
        String expectedOutput = new String();
        expectedOutput = "bc";
        assertEquals(expectedOutput, testCeaserCipher.CeasarCipher("bc", 2));
    }

}