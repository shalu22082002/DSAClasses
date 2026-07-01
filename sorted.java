import java.util.*;
class sorted{
        static boolean isSorted (int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
        }
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();  
        }

        
        if(isSorted(arr)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    } 
}