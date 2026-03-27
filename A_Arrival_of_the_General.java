import java.util.Scanner;
public class A_Arrival_of_the_General {
    public static void main(String[] args) {
        Scanner sc =new  Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
 
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int maxIndex = 0;
        int minIndex = 0;
        for(int i=0;i<n;i++){
            if(arr[maxIndex]<arr[i]){
                maxIndex = i;
            }
        }
         for(int i=0;i<n;i++){
            if(arr[minIndex]>=arr[i]){
                minIndex = i;
            }
        }

   int moves = maxIndex + (n - 1 - minIndex);

        if (maxIndex > minIndex) {
            moves--;
        }

        System.out.println(moves);
     





        sc.close();
    }
}
