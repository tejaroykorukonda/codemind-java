import java.util.Scanner;
class multi
{
   public static void main(String args[])
{
float a,b;
float c;
Scanner sc=new Scanner(System.in);
a=sc.nextFloat();
b=sc.nextFloat();

System.out.println(""+String.format("%.2f",a*b));
sc.close();
}
}