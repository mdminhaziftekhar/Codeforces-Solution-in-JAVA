import java.util.Collections;
import java.util.Scanner;
import  java.util.ArrayList;
import  java.util.Collection;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int mid = 0;

        ArrayList<Integer> v = new ArrayList<Integer>();

        for(int i = 0; i<3; i++){
            int a = scan.nextInt();
            v.add(a);
        }

        Collections.sort(v);

        int ans = 0;

        mid = v.get(1);

        if(v.get(0) >= mid){
            if(v.get(0) > mid){
                ans = ans + (v.get(0) - mid);
            }
            else {
                ans = ans + 0;
            }
        }
        else{
            ans = ans + (mid - v.get(0));
        }
        if(v.get(2) >= mid){
            if(v.get(2) > mid){
                ans = ans + (v.get(2) - mid);
            }
            else {
                ans = ans + 0;
            }
        }
        else{
            ans = ans + (mid - v.get(2));
        }
        System.out.println(ans);
    }
}
