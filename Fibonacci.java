import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci dizesi'nin öğrenmek istediğiniz sırasını yazınız");
        int line1=0;
        try{
            line1 = sc.nextInt();
        }
        catch (Exception e){
            System.err.println("Girdiğiniz değer geçersizdir.");
            return;
        }
        sc.close();
            if(line1<=0){
                System.out.println("Girdiğiniz değer geçersizdir.");
            }
            else {
                System.out.println(line1 + " sırasında terim değeri = " + findFibonacci(line1));
            }
    }

    public static int findFibonacci(int line1) {
            int ilkTerim = 0;
            int ikinciTerim = 1;
            int sonrakiTerim =0;
            if (line1 == 1) {
            return ilkTerim;
            }
            if (line1 == 2) {
            return ikinciTerim;
            }
            for (int i = 1; i < line1 ; i++) {
                ilkTerim = ikinciTerim;
                ikinciTerim = sonrakiTerim;
                sonrakiTerim = ilkTerim + ikinciTerim;
            }
            return sonrakiTerim;
        }

}
