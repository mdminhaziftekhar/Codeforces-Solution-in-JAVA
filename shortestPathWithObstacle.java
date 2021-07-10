/*
Minhaz Iftekhar's Template (Copied template haha :p)
use this and you'll die
 */
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static java.lang.System.out;
import java.util.*;
import java.io.*;
import java.math.*;

public class shortestPathWithObstacle
{
    public static void main(String hi[]) throws Exception {
        FastScanner s = new FastScanner();
        //BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(infile.readLine());
        //int N = Integer.parseInt(st.nextToken());
        //int M = Integer.parseInt(st.nextToken());

        //driver code
        int t = s.nextInt();

        for(int i = 0; i<t; i++){
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            int d = s.nextInt();
            int e = s.nextInt();
            int f = s.nextInt();

            int mx = Math.max(b, d);
            int mn = Math.min(b, d);
            int mx1 = Math.max(a, c);
            int mn1 = Math.min(a, c);

            if(a == c && c == e){
                if(mn < f && mx > f){
                    out.println((mx-mn) + 2);
                }else out.println(mx-mn);
            }
            else if(b==d && d==f){
                if(mn1 < e && mx1 > e){
                    out.println((mx1-mn1) + 2);
                }else out.println(mx1 - mn1);
            }
            else{
                out.println((mx-mn) + (mx1-mn1));
            }
        }

    }

    public static int[] readArrInt(int N, FastScanner f)
    {
        int[] arr = new int[N];
        for(int i=0; i < N; i++)
            arr[i] = f.nextInt();
        return arr;
    }
    public static void printArrInt(int[] arr)
    {
        //for debugging only
        for(int x: arr)
            out.print(x+" ");
        out.println();
    }
    public static double[] readArrDouble(int N, FastScanner f)
    {
        double[] arr = new double[N];
        for(int i=0; i < N; i++)
            arr[i] = f.nextDouble();
        return arr;
    }
    public static void printArrDouble(Double[] arr){
        for(Double x : arr)
            out.println(x + " ");
        out.println();
    }

    public static long[] readArrlong(int N, FastScanner f)
    {
        long[] arr = new long[N];
        for(int i=0; i < N; i++)
            arr[i] = f.nextLong();
        return arr;
    }
    public  static void printArrlong(long[] arr){
        for(long x : arr)
            out.println(x + " ");
        out.println();
    }
    public static boolean isPrime(long n)
    {
        if(n < 2) return false;
        if(n == 2 || n == 3) return true;
        if(n%2 == 0 || n%3 == 0) return false;
        long sqrtN = (long)Math.sqrt(n)+1;
        for(long i = 6L; i <= sqrtN; i += 6) {
            if(n%(i-1) == 0 || n%(i+1) == 0) return false;
        }
        return true;
    }
    public static long gcd(long a, long b)
    {
        if(a > b)
            a = (a+b)-(b=a);
        if(a == 0L)
            return b;
        return gcd(b%a, a);
    }
    public static void sortArr(int[] arr)
    {
        //because Arrays.sort() uses quicksort which is dumb
        //Collections.sort() uses merge sort
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for(int x: arr)
            ls.add(x);
        Collections.sort(ls);
        for(int i=0; i < arr.length; i++)
            arr[i] = ls.get(i);
    }
static class FastScanner
{
    //I don't understand how this works lmao
    private int BS = 1 << 16;
    private char NC = (char) 0;
    private byte[] buf = new byte[BS];
    private int bId = 0, size = 0;
    private char c = NC;
    private double cnt = 1;
    private BufferedInputStream in;

    public FastScanner() {
        in = new BufferedInputStream(System.in, BS);
    }

    public FastScanner(String s) {
        try {
            in = new BufferedInputStream(new FileInputStream(new File(s)), BS);
        } catch (Exception e) {
            in = new BufferedInputStream(System.in, BS);
        }
    }

    public char getChar() {
        while (bId == size) {
            try {
                size = in.read(buf);
            } catch (Exception e) {
                return NC;
            }
            if (size == -1) return NC;
            bId = 0;
        }
        return (char) buf[bId++];
    }

    public int nextInt() {
        return (int) nextLong();
    }

    public int[] nextInts(int N) {
        int[] res = new int[N];
        for (int i = 0; i < N; i++) {
            res[i] = (int) nextLong();
        }
        return res;
    }

    public long[] nextLongs(int N) {
        long[] res = new long[N];
        for (int i = 0; i < N; i++) {
            res[i] = nextLong();
        }
        return res;
    }

    public long nextLong() {
        cnt = 1;
        boolean neg = false;
        if (c == NC) c = getChar();
        for (; (c < '0' || c > '9'); c = getChar()) {
            if (c == '-') neg = true;
        }
        long res = 0;
        for (; c >= '0' && c <= '9'; c = getChar()) {
            res = (res << 3) + (res << 1) + c - '0';
            cnt *= 10;
        }
        return neg ? -res : res;
    }

    public double nextDouble() {
        double cur = nextLong();
        return c != '.' ? cur : cur + nextLong() / cnt;
    }

    public double[] nextDoubles(int N) {
        double[] res = new double[N];
        for (int i = 0; i < N; i++) {
            res[i] = nextDouble();
        }
        return res;
    }

    public String next() {
        StringBuilder res = new StringBuilder();
        while (c <= 32) c = getChar();
        while (c > 32) {
            res.append(c);
            c = getChar();
        }
        return res.toString();
    }

    public String nextLine() {
        StringBuilder res = new StringBuilder();
        while (c <= 32) c = getChar();
        while (c != '\n') {
            res.append(c);
            c = getChar();
        }
        return res.toString();
    }

    public boolean hasNext() {
        if (c > 32) return true;
        while (true) {
            c = getChar();
            if (c == NC) return false;
            else if (c > 32) return true;
        }
    }
}
}
