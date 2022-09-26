import java.util.Scanner;
class Cars
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t-->0)
        {
        double s1,s2,p1,p2,a,b;
        s1=sc.nextInt();
        s2=sc.nextInt();
        p1=sc.nextInt();  
        p2=sc.nextInt();
        a=p1/s1;
        b=p2/s2;
        if(a<b)
        {
            System.out.println("-1");
        }
        else
        {
            if(a>b)
            {
                  System.out.println("1");
            }
            else
                System.out.println("0");
        }
    }
}
}