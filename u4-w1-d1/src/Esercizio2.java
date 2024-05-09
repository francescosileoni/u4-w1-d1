import java.util.Scanner;

public class Esercizio2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci 3 stringhe");
        String string1 = scanner.nextLine();
        System.out.println("prima stringa inserita :" + string1);
        String string2 = scanner.nextLine();
        System.out.println("seconda stringa inserita :" + string2);
        String string3 = scanner.nextLine();
        System.out.println("terza stringa inserita :" + string3);
        System.out.println("concatenazione stringhe : " + string1 + " " + string2 + " " + string3);
        System.out.println("concatenazione stringhe inversa : " + string3 + " " + string2 + " " + string1);
        scanner.close();

    }
}
