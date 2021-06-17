import java.util.ArrayList;
import java.util.Scanner;

public class teamOlympiad490A {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> index1 = new ArrayList<>();
        ArrayList<Integer> index2 = new ArrayList<>();
        ArrayList<Integer> index3 = new ArrayList<>();
        int n = scan.nextInt();
        int count1 = 0, count2 = 0, count3 = 0, min = Integer.MAX_VALUE;

        for(int i = 1; i<=n; i++){
            int a = scan.nextInt();
            switch(a){
                case(1):{
                    count1++;
                    index1.add(i);
                    break;
                }
                case(2):{
                    count2++;
                    index2.add(i);
                    break;
                }
                case(3):{
                    count3++;
                    index3.add(i);
                    break;
                }
            }
        }

        min = Math.min(count1, Math.min(count2, count3));

        System.out.println(min);

        if(min>0){
            for(int i = 0; i<min; i++){
                System.out.println(index1.get(i)+" "+index2.get(i)+" "+index3.get(i));
            }
        }

    }
}
