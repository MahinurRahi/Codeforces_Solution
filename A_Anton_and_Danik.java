import java.util.Scanner;
public class A_Anton_and_Danik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    String s = sc.next();
    int countD=0;
    int countA=0;
   
    
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='D'){
            countD++;
        }else{
            countA++;
        }
    }if(countD>countA){
        System.out.print("Danik");
    }else if(countD<countA){
        System.out.print("Anton");
    }else{
        System.out.print("Friendship");
    }




        sc.close();
    }
}
