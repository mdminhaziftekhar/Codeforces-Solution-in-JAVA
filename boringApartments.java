import java.util.Scanner;

import static java.lang.System.out;

public class boringApartments {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //driver code
        int t = s.nextInt();

        for(int k = 0; k<t; k++){
            String s1 = s.next();
            //out.println("s1 "+s1);
            String s2 = "";
            //out.println("S2 : "+s2);
            s2 += s1.charAt(0);
            //out.println("S2 : "+ s2);
            int a = Integer.parseInt(s2);
            int sum = 0;
            //out.println("A : "+a);
            if(a > 1) {
                for(int i = 0; i<a-1; i++){
                    sum += 10;
                }
            }
            switch (s1.length()){
                case 1 : {
                    sum += 1;
                    break;
                }
                case 2 : {
                    sum += 3;
                    break;
                }
                case 3 : {
                    sum += 6;
                    break;
                }
                case 4 : {
                    sum += 10;
                    break;
                }
            }
            out.println(sum);
        }
    }

}

