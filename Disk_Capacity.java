import java.util.Scanner;
import java.lang.Math;
class disk
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        int s;
        
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=a*b*c*2*512;
        
        System.out.println(s);
        sc.close();
        
    }
}