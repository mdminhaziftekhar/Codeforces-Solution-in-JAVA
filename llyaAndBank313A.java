import java.util.Scanner;

public class llyaAndBank313A {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        if(s.charAt(0) == '-'){
            if(s.length() == 2){
                if(s.charAt(0) == '-'){
                    s = "0";
                }else{
                    s = remove(s, 1);
                }
            }
            else if(s.length() == 3){
                    int n;
                    if(s.charAt(s.length()-2) > s.charAt(s.length()-1)) n = s.length()-2;
                    else n = s.length()-1;
                    s = remove(s, n);
                    if(s.charAt(1) == '0') {
                        s = "0";
                    }
            }
            else if(s.length() > 3){
                int n;
                if(s.charAt(s.length()-2) > s.charAt(s.length()-1)) n = s.length()-2;
                else n = s.length()-1;
                s = remove(s, n);
            }

        }

        System.out.println(s);

    }
    public static String remove(String s, int n){
        return (s.substring(0, n) + s.substring(n+1));
    }
}
