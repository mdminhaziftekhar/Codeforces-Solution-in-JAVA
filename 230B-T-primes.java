import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        long arr[] = new long[1000000+1];
        Arrays.fill(arr, 0);
 
        for (int i = 2; i<1000000+1; i++){
            if(arr[i] == 0){
                for (int j = 2; i*j <1000000+1; j++){
                    arr[i*j] = 1;
                }
            }
        }
 
//        for(int i = 0; i<4; i++) System.out.println(arr[i]);
 
        long x = scan.nextLong();
 
        while(x>0){
            x--;
            long b = scan.nextLong();
            long sq = (long) Math.sqrt(b);
            if(b == 1) System.out.println("NO");
            else if((sq*sq)==b && arr[(int)sq]==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
