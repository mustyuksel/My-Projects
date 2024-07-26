import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci dizesi'nin öğrenmek istediğiniz sırasını yazınız");
     int line1 = sc.nextInt();
        System.out.println(line1 +" sırasında terim değeri = "+ findFibonacci(line1 ));
    }

    public static int findFibonacci(int line1) {
        int ilkTerim = 0;
        int ikinciTerim = 1;
        int sonrakiTerim = ilkTerim + ikinciTerim;
        if (line1 == 1) {
            return ilkTerim;
        }
        if(line1==2){
            return ikinciTerim;
        }
        if(line1==3){
            return ikinciTerim + ilkTerim;
        }
        for (int i = 0; i < line1-3; i++) {
            ilkTerim = ikinciTerim;
            ikinciTerim = sonrakiTerim;
            sonrakiTerim = ilkTerim + ikinciTerim;
        }
            return sonrakiTerim;
    }
}
