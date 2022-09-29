import java.util.Scanner;
class num
{
    public static void main(String arg[]){
    int n,i,j;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n;j++)
        {
            if(i==j||j==1||j==n)
            {
                System.out.print("* ");
            }
            else
            {
                System.out.print("  ");
            }
        }
       System.out.println();
    }
}
}