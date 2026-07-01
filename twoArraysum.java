import java.util.Scanner;

public class twoArraysum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arra[] = new int[n];
        int arrb[] = new int[n];
        for(int i=0;i<n;i++){
            arra[i] = sc.nextInt();  
        }
        for(int j=0;j<n;j++){
            arrb[j] = sc.nextInt();  
        }
        for(int i=0;i<n;i++){
                System.out.print(arra[i]+arrb[n-1-i] +" ");
        }
    }
}
