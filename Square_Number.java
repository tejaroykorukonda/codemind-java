import java.util.Scanner;
class Sq{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int f=0;
        for(int i=0;i<(a/2);i++){
            for(int j=0;j<(a/2);j++){
                if(i*i+j*j==a){
                    f=f+1;
                }
            }
        }
        if(f==0){
            System.out.println("False");
        }
        else{
             System.out.println("True");
            
        }
    }
}