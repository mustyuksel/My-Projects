import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Set;

public class WordBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the word you want to split ");
        String line="";
        try{
            line = sc.nextLine();  // Input line for the word that needs to be broken
            if (!line.matches("[a-zA-Z]+")) {
                throw new Exception();
            }
        }
        catch (Exception e){
            System.err.println("Your input is invalid");
            main(args);
        }
        System.out.println("Please enter how many words you want to split the first word ");
        int a =0;
        try {
             a = sc.nextInt(); // For how many words needed to split
        }
        catch (Exception e ){
            System.err.println("Your input is invalid");
            main(args);
        }
        sc.nextLine();
        ArrayList<String> wordDict = new ArrayList<>(); // For splitting the word into pieces
        String line2="";
        System.out.println("Please enter your words");
        try{
            for (int i = 0; i < a; i++) {  // For loop adds new words to array
                 line2 = sc.nextLine();
                wordDict.add(line2);
            }
            if (!line2.matches("[a-zA-Z]+")) {
                throw new Exception();
            }
        }catch (Exception e){
            System.err.println("Your input is invalid");
            main(args);
        }
        sc.close(); // Closes the scanner
        System.out.println(wordBreak(wordDict, line));
    }

    public static boolean wordBreak(ArrayList wordDict, String line) {
        Set<String> set = new HashSet<>(wordDict); // The information stored in arraylist sent into hashset
        boolean[] used = new boolean[line.length()+1];
        used[0]=true;
        for (int a = 1; a <= line.length(); a++) { // Searches into every possible scenerio
            for (int j = 0; j < a; j++) {
                if (used[j] && set.contains(line.substring(j, a))) {
                    used[a] = true;
                    break;
                }
            }
        }
        return used[line.length()];
    }
}
