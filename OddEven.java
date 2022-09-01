// Program To Check Odd or even
import java.util.Scanner;
class A1{
    public int i=0;
    A1(){
        System.out.println(" Checking Odd And Even ");
    }
    public static int Checking(int x){
            if(x%2==0)// if the number is even its remainder is 0
                return 1;
            else 
                return 0;
    }
}
class OddEven{
    private static Scanner sc;// To Take inputs 
    public static void main(String args[]){
        
        sc = new Scanner(System.in);
        // Creted an object for taking input 
        System.out.println("Enter The nUmber : ");
        int x =sc.nextInt();
        int y=A1.Checking(x);
        if(y==1)
            System.out.println("Number is Even");
        else
            System.out.println(" Number is odd");
        
    }
}