import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class twoArraysSwap1353B {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        while(t>0){
            t--;

            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();

            int size = scan.nextInt();
            int k = scan.nextInt();

            for(int i = 0; i<size; i++){
                int c = scan.nextInt();
                a.add(c);
            }
            for(int i = 0; i<size; i++){
                int c = scan.nextInt();
                b.add(c);
            }

            Collections.sort(a);
            Collections.sort(b);

            int i = 0, j = a.size()-1;

            if(k > 0){
                for(;i<a.size();i++,j--){
                    k--;
                    if(a.get(i) < b.get(j)){
                        int temp = a.get(i);
                        a.set(i, b.get(j));
                        b.set(j, temp);
                    }
                    if(k<=0) break;
                }
            }
            int sum = 0;
            for(i = 0; i<a.size(); i++) sum = sum + a.get(i);
            System.out.println(sum);
        }

    }
}
