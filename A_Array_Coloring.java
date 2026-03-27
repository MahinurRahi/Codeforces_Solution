import java.util.*;
public class A_Array_Coloring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
       
        while(t-->0){
             int count = 0;
            int n=sc.nextInt();
            int []arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                
                if(arr[i]%2!=0){
                    count++;
                }

            }
            if(count%2==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }


        sc.close();
    }
}
