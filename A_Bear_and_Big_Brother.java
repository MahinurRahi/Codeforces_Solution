import java.util.Scanner;
public class A_Bear_and_Big_Brother {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int  limak;
    int  bob;
       limak = sc.nextInt();
       bob   = sc.nextInt();
   
    int count = 0;
 

    for(int i=1;i<1000;i++){
    limak = limak*3;
    bob  = bob*2;
        count++;

    if(limak > bob){
        
        break;

    }
     
    
    }

    System.out.println(count);



        sc.close();
    }
}
