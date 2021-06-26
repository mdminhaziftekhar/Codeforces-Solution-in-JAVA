import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class honestCoach {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        while(t>0){
            t--;

            int n = scan.nextInt();

            int[] arr = new int[n];

            for(int i = 0; i < arr.length; i++){
                arr[i] = scan.nextInt();
            }

            Arrays.sort(arr);
//            for (int i = 0; i<arr.length; i++) System.out.print(arr[i]+" ");
//            System.out.println();
            int min = Integer.MAX_VALUE;

            for(int i = 1; i<arr.length; i++){
                if((arr[i]-arr[i-1])<min) min = arr[i]-arr[i-1];
            }

            System.out.println(min);

        }

    }
}
