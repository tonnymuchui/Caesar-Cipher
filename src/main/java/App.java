import java.util.Scanner;

public class App {

    public static void main(String[] args){
        Scanner scar= new Scanner(System.in);
        Encrypt obj = new Encrypt();
        Decrypt decypt = new Decrypt();
        boolean navigation=true;

        while(navigation) {
            System.out.println("What would you like to do? Reply with one of the options: Encrypt ,Decrypt or Exit!");
            String userControl = scar.nextLine();


            if (userControl.equals("Encrypt")){
                System.out.println("welcome to encrypt");

                System.out.println("Please, Enter text, that you want to encrypt!");
                String userInputText = scar.nextLine();
                System.out.println("Please, Enter the shift number!");
                int UserShiftNumber = Integer.parseInt(scar.nextLine());

                String resultedEncyptedText = obj.encrypt(userInputText, UserShiftNumber);
                System.out.println("This is the Encypted text");
                System.out.println("*************************");
                System.out.println(resultedEncyptedText);
            }
            else if(userControl.equals("Decrypt")){
                System.out.println("Please! enter text that you want to decypt");
                String userInputText = scar.nextLine();
                System.out.println("Please enter shift number!");
                String strNumber= scar.nextLine();
                int iputedShiftNumber=Integer.parseInt(strNumber);

//           String resultedEncyptedText = obj.encrypt(userInputText, iputedShiftNumber);
                String resultedDecryptedText=decypt.decrypt(userInputText,iputedShiftNumber);
                System.out.println("This is the Decrypted text");
                System.out.println("*************************");
                System.out.println(resultedDecryptedText);
            }
            else if(userControl.equals("Exit")){
                navigation=false;
            }else{
                System.out.println("Invalid input");
            }
//
        }
    }

}