import java.util.Scanner;
   class MainClass{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int N;
        N=sc.nextInt();
        for(int i=0;i<N;i++){
            for(int j=1;j<=N;j++){
                System.out.print((char)(i+65)+" ");
            }
            System.out.println();
        }
        sc.close();
       
    }
}