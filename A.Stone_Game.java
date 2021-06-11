import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A.Stone_Game {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);

	    int t = scan.nextInt();

	    while(t>0){
	        t--;
            int size = scan.nextInt();
	        ArrayList<Integer> arr = new ArrayList<>();

	        for(int i = 0 ;i <size; i++){
	            int b = scan.nextInt();
	            arr.add(b);


            }


            int index1 = 0, index2 = 0;

            for(int i = 0; i < arr.size(); i++){
                if(arr.get(i) < arr.get(index1)) index1 = i;
                if(arr.get(i) > arr.get(index2)) index2 = i;
            }
            int min1 = Math.min(index1, index2);
            int max1 = Math.max(index1, index2);

            int ans1 = max1 + 1;
            int ans2 = size - min1;
            int ans3 = min1 + 1 + size - max1;

            //min({big + 1, small + 1 + N - big, N - small})

            System.out.println(Math.min(ans1, Math.min(ans2, ans3)));

        }
    }
}
