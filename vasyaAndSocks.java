import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class vasyaAndSocks {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i = 0, ans = 0, count = 0;

        int n = scan.nextInt();
        int m = scan.nextInt();

        for(i = m-1; i<n; i+=m) count++;

//        System.out.println("i+1 = "+(i+1)+" count = "+count);

        while(i<=((n+count)-1)){
            i+=m;
            count++;
        }

        ans = n+count;

        System.out.println(ans);

    }
}
