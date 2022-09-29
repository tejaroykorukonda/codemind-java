import java.util.Scanner;
class num
{
    public static void main(String arg[]){
    int n,i,j,k;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(i=n;i>=1;i--)
    {
        for(j=1;j<i;j++)
        {
            System.out.print(" ");
        }
        for(k=1;k<=n;k++)
        {
            if(i==1||i==n||k==1||k==n)
            {
                 System.out.print("*");
            }
            else
            {
                 System.out.print(" ");
            }
        }
         System.out.println();
    }
}
}