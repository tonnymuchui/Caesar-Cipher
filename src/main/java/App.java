import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner myCipher = new Scanner(System.in);
        CeasarCipher classCipher = new CeasarCipher();

        System.out.println("Write something!");

        String mycaesar = myCipher.nextLine();
        System.out.println(classCipher.ceasarCipher(mycaesar, 4));
    }
}
