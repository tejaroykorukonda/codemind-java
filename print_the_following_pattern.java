import java.util.Scanner;
class num
{
    public static void main(String arg[]){
    int n,i,j;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n-2;j++)
        {
            System.out.print(j);
        }
        for(j=1;j<n-2;j++)
        {
            System.out.print(j);
        }
        System.out.println();
    }
    }
}