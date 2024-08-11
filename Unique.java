import java.util.Scanner;

public class Unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir kelime yazın ve benzersiz mi değil mi öğrenin.");
        String line1 ="";
        try{
            line1 = sc.nextLine();
            if(!line1.matches("[a-zA-Z]+")){
                throw new Exception();
            }
        }
        catch (Exception e){
            System.err.println("Geçersiz kelime tekrar deneyiniz ");
            main(args);
            sc.close();
            return;
        }
        sc.close();
        String lowerLine = line1.toLowerCase();
        String Line1[] = lowerLine.split("");
        if(findUnique(Line1)){
            System.out.println(line1+" bir benzersiz kelimedir. ");
        }
        else {
            System.out.println(line1+" benzersiz bir kelime değildir. ");
        }
    }
    public static boolean findUnique(String[] Line1){
        int counter =0;
        for (int i = 0; i < Line1.length; i++) {
            for (int a = 0; a < Line1.length; a++) {
                if(i==a){
                    continue;
                }
                if (Line1[i].equals(Line1[a])) {
                    counter++;
                }
            }
        }
        if(counter>0){
            return false;
        }
        else{
            return true;
        }
    }
}
