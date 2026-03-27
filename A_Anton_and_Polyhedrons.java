import java.util.Scanner;
public class A_Anton_and_Polyhedrons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int count = 0;
        for(int i=0;i<n;i++){
            String str = "";
            str = sc.nextLine();

            if(str.equals("Tetrahedron")){
                count+=4;
            }else if(str.equals("Cube")){
                count+=6;
            }else if(str.equals("Octahedron")){
                count+=8;
            }else if(str.equals("Dodecahedron")){
                count+=12;
            }else{
                count+=20;
            }

        }
        System.out.print(count);
        sc.close();
    }
}
