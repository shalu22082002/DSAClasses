
import java.util.*;

class countofpn {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;

        for (int j = 0; j < n; j++) {
            boolean isPrime = true;
            for (int i = 2; i * i <= arr[j]; i++) {
                if (arr[j] % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }

        System.out.println(count);

    }

}
