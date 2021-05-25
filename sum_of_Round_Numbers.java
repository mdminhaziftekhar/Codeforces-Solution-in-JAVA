import java.util.*;

public class sum_of_Round_Numbers {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        while(t > 0){
            t--;

            String s = scan.next();
            int count = 0;

            for(int i = 0; i<s.length(); i++){
                if(s.charAt(i) != '0') {
                    count++;
                }
            }

            System.out.println(count);

            for(int i = 0; i<s.length(); i++){
                if(s.charAt(i) != '0'){
                    int s2 = s.length() - (2+(i-1));
                    String s3 = "";
                    for(int j = 0; j<s2; j++){
                        s3+='0';
                    }

                    s3 = s.charAt(i) + s3;
                    System.out.print(s3+" ");

                }
            }

            System.out.println();
        }


    }

}
