import java.util.Scanner;

public class mishkaAndGame {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int countM = 0, countC = 0;

        while(n>0){
            n--;

            int a = scan.nextInt();
            int b = scan.nextInt();

            if(a > b) countM++;
            else if(b > a) countC++;

        }
        if(countM > countC) System.out.println("Mishka");
        else if(countC > countM) System.out.println("Chris");
        else System.out.println("Friendship is magic!^^");
    }
}
