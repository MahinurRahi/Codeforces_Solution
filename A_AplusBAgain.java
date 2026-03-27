import java.util.*;
public class A_AplusBAgain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int sum=0;
            int n = sc.nextInt();
            for(int i=0;i<2;i++){
                int mod = n%10;
                sum+=mod;
                n/=10;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
