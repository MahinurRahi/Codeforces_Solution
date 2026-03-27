import java.util.*;
public class A_Amusing_Joke {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
    
         String con = str1+str2;

         if(con.length()!=str3.length()){
            System.out.println("NO");
            return;
         }
         char []  arr1 = con.toCharArray();
         char []  arr2 = str3.toCharArray();

         Arrays.sort(arr1);
         Arrays.sort(arr2);


         if(Arrays.equals(arr1,arr2)){
            System.out.println("YES");
         }else{
            System.out.println("NO");
         }


     sc.close();

    }
}
