
import java.util.*;
class Allpairesum{
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();  
        }
        int sum = 0;
        for (int i = 0; i <n-1 ; i++) {
            for(int j=i+1;j<n;j++){
                sum=arr[i]+arr[j];
               System.out.print(arr[i]+" " +arr[j]); 
                if(sum> max){
                    max=sum;
                }
            }
        }
        System.out.print(max);
     
    }
}