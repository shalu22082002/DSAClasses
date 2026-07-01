
import java.util.*;
class largestMun{
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
                max=arr[i];
            }
        }
        System.out.println("largest num :"+max);
    }
}