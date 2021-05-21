import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int ans = (int)1e8;

        for(int i = 0 ; i <= n; i++){
            int now = (i*a)+(n-i+m-1)/m*b;
            ans = Math.min(ans, now);
        }

        System.out.println(ans);

    }
}
