import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class A_Anton_and_Letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Set<Character> set = new HashSet<>();
        for(char ch :s.toCharArray()){
            if(Character.isLetter(ch)){
             set.add(ch);
            }
        }
        System.out.println(set.size());






        sc.close();
    }
}
