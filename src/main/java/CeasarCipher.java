public class CeasarCipher {

public String ceasarCipher(String subText , int shift) {

    if (shift > 26){
        shift = shift%26;
    } else if (shift<0){
        shift = (shift % 26)+ 26;
    }
    String cipherText= "";
    int length = subText.length();
    for (int i = 0; i<length; i++){
        char ch = subText.charAt(i);
        if (Character.isLetter(ch)){
            if (Character.isLowerCase(ch)){
                char c = (char)(ch+shift);
                if (c > 'Z'){
                return     cipherText + (char)(ch - (26-shift));
                } else {
                 return    cipherText + c;
                }
            } else if (Character.isUpperCase(ch)){
                char c = (char)(ch+shift);
                if (c >'Z'){
                  return   cipherText + (char)(ch - (26-shift));
                } else {
                  return   cipherText + ch;
                }
            }
        } else {
         return    cipherText + ch;
        }

    }
    System.out.println(cipherText);
    return cipherText;
}
}

