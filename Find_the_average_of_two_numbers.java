import java.util.Scanner;
class Avg
{
    public static void main(String args[])
    {
        int N,M;
        float Avg;
    Scanner sc=new Scanner(System.in);
    N=sc.nextInt();
    M=sc.nextInt();
    Avg=(float)(N+M)/2;
    System.out.format("%.4f",Avg);
    }
    
    
}