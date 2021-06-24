import java.util.Scanner;

public class evenArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        while(t > 0){
            t--;

            int n = scan.nextInt();
            int countFine = 0, countEven = 0, countOdd = 0;

            for(int i = 0; i<n; i++){
                int a = scan.nextInt();

                if(i%2==0 && a%2!=0) countEven++;
                else if(i%2!=0 && a%2==0) countOdd++;
                else countFine++;

            }

            if (countFine == n) System.out.println(0);
            else if(countEven == countOdd) System.out.println(countEven);
            else if (countEven>countOdd || countOdd>countEven) System.out.println(-1);

        }

    }
}
