public class Decrypt {

    public static String decrypt(String plaintText, int shift){
        if(shift >26){
            shift = shift%26;
        }
        else if(shift < 0){
            shift= (shift % 26) + 26;
        }

        String cipherText="";
        int length=plaintText.length();
        for(int i=0; i<length;i++){
            char ch= plaintText.charAt(i);
            if(Character.isLetter(ch)){
                if (Character.isLowerCase(ch)){
                    char c=(char) (ch-shift);
                    if(c<'a'){
                        cipherText += (char)(ch + (26 -shift));
                    }else{
                        cipherText += c;
                    }
                }else if(Character.isUpperCase(ch)){
                    char c=(char) (ch - shift);
                    if(c<'A'){
                        cipherText += (char)(ch + (26 -shift));
                    }else{
                        cipherText += c;
                    }
                }

            }else{
                cipherText+= ch;

            }

        }
        return cipherText;
    }
}
}
