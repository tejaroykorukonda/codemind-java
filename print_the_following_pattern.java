import java.util.Scanner;
class num{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        int alp=64;
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print((char)(i+alp)+" ");
            }
            System.out.println();
        }
        
    }
}