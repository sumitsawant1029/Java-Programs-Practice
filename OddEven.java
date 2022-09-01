// Program To Check Odd or even
import java.util.Scanner;
class A1{
    public int i=0;
    A1(){
        System.out.println(" Checking Odd And Even ");
    }
    public static int Checking(int x){
            if(x%2==0)
                return 1;
            else 
                return 0;
    }
}
class OddEven{
    public static void main(String args[]){
        public static Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Enter The nUmber : ");
        int x =sc.nextInt();
        y=A1.Checking(x);
        if(y==1)
            System.out.println("Number is Even");
        else
            System.out.println(" Number is odd");
        
    }
}