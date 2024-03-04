public class Esercizio1 {
    public static void main(String[] args) {
        int result = moltiplica(2, 9);
        System.out.println("Il prodotto è: " + result);

        String risultato = concat("Numero: ", 52);
        System.out.println(risultato);
    }

    public static int moltiplica(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    public static String concat(String str, int num) {
        String risultato = str + num;
        System.out.println(risultato);
        return risultato;
    }
}