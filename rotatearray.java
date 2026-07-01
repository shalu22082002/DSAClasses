import java.util.Scanner;

public class rotatearray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int rotate = sc.nextInt();

        for (int j = 0; j < rotate; j++) {
            int t = arr[n - 1];
            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = t;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
