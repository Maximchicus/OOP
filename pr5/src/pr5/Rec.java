package pr5;

public class Rec {
    static String s = "";
    public static int Akker(int m, int n){
        if(m==0) return n+1;
        else if(n==0) return Akker(m-1, 1);
        else return Akker(m-1, Akker(m, n-1));
    }
    public static String Nech(int n){
        if(n==0) return "No";
        else if(n==1) return "Yes";
        else return Nech(n-2);
    }
    public static String LeftRight(int n) {
        if(n==0) return "";
        if(n<10) return Integer.toString(n);
        else return Integer.toString(n%10)+" "+LeftRight(n/10);
    }
}