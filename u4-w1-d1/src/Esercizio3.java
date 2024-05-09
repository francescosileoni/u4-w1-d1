public class Esercizio3 {
    public static void main (String[] args) {

        System.out.println("calcolo il perimetro di un rettangolo con base 3,5 e altezza 7,2: " + perimetroRettangolo(3.5,7.2));
        System.out.println("calcolo se il numero 27 è pari o dispari: " + pariDispari(27));
        System.out.println("calcolo se il numero 50 è pari o dispari: " + pariDispari(50));
    }
     public static double perimetroRettangolo(double base , double altezza ){ return 2*base + 2*altezza ;}
     public static int pariDispari(int num1){ return num1 %2  == 0 ?  0 : 1;}

}
