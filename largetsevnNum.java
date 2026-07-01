import java.util.Scanner;


public class largetsevnNum {
         public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();  
        }
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                if(arr[i]%2==0){
                    max=arr[i];
                }
                
            }
        }
        System.out.println("largest even num : "+max);
    }
}
