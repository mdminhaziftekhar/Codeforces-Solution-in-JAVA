import java.util.Scanner;

public class newYearCandles {
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int x = a;

        while(a>=b){

            x = x + (a/b);
            a= (a/b) + (a%b);

        }

        System.out.println(x);
    }
}
