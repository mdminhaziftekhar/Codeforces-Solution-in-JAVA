import java.util.Scanner;

public class giftsFixing {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        while(t>0){
            t--;

            Long count = 0L;
            Long minA = Long.MAX_VALUE, minB = Long.MAX_VALUE;

            int n = scan.nextInt();

            Long[] a = new Long[n];
            Long[] b = new Long[n];

            for(int i = 0; i < n; i++){
                a[i] = scan.nextLong();
                if(a[i]<minA) minA = a[i];
            }
            for(int i = 0; i < n; i++){
                b[i] = scan.nextLong();
                if(b[i]<minB) minB = b[i];
            }
            //System.out.println("MinA = "+minA+" minB = "+minB);

            for(int i = 0; i<n; i++){
                if((a[i]-minA)==0 && b[i]-minB!=0){
                    count = count + (b[i]-minB);
                }
                else if((a[i]-minA)!=0 && b[i]-minB==0){
                    count = count + (a[i]-minA);
                }
                else{
                    count = count + Math.max(a[i]-minA, b[i]-minB);
                }
            }

            System.out.println(count);
        }

    }
}
