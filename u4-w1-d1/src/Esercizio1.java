import java.util.Arrays;

public class Esercizio1 {
    public static void main(String[] args) {

        System.out.println("il  metodo moltiplica due numeri : "+ moltiplica(2, 200) );
        System.out.println(" il metodo concatena una stringa ad un numero :" + concat("cento" , 100));
        String[] arr = insertIntoArray(new String[]{"A", "B", "C", "D", "E"}, "aaaaa");
        System.out.println(Arrays.toString(arr));
    }

    public static int moltiplica(int num1, int num2) {return num1 * num2 ;}

    public static String concat(String str, int num) {return str + num;}
    public static String[] insertIntoArray(String[] stringArray, String str) {
        String[] array = new String[6];
        for (int i = 0; i < stringArray.length +1 ; i++) {
            if(i < 2) {
                array[i] = stringArray[i];
            } else if(i == 2) {
                array[i] = str;
            } else {
                array[i] = stringArray[i - 1];
            }
        }

        return array;
    }
}