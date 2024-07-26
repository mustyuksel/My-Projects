import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Anagram olduğunu karşılaştırmak istediğiniz kelimelerden ilkini giriniz");
        String line1 = sc.nextLine();
        System.out.println("İkincisini giriniz");
        String line2 = sc.nextLine();
        String lowerLine = line1.toLowerCase();
        String lowerLine2 = line2.toLowerCase();
        String Line1[] = lowerLine.split("");
        String Line2[] = lowerLine2.split("");
        if(Line1.length == Line2.length) {
           if(findAnagram(Line1, Line2)){
               System.out.println("bu iki kelime anagramdır");
           }
           else{
               System.out.println(" bu iki kelime anagram değildir");
           }
        }
    }
    public static boolean findAnagram(String[] Line1, String[] Line2){
        boolean[] usedWords = new boolean[Line2.length];
        int counter =0;
        for (int i = 0; i < Line1.length; i++) {
            int a = 0;
            for (a = 0; a < Line2.length; a++) {
                if (!usedWords[a]) {
                    if (Line1[i].equals(Line2[a])) {
                        counter++;
                        usedWords[a] = true;
                    }
                }
            }
        }
        if(counter== Line1.length){
            return true;
        }
        else {
            return false;
        }
    }
}