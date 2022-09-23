import java.util.Scanner;
class Num
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    //takes input from user
 
    int rows = sc.nextInt();
 
    for (int i= rows-1; i>=0 ; i--)
    {
    for (int j=1; j<=i+1; j++)
    {
    System.out.print(j+"");
    }
    System.out.println();
    }
    sc.close();
    }
    }