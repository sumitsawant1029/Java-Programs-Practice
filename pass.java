// Object Called By there Reference 

class OCBR{
    int a,b;
    OCBR(int i, int j){
        a=i;// To Assign Values
        b=j;
    }
// Adding method for Operations
    void meth(OCBR o){
        o.a *= 2;
        o.b /= 2;
    }
}
public class pass{
    public static void main(String args[]){
        OCBR ob = new OCBR(12,22);//Created an Object
        System.out.println(""+ob.a+""+ob.b);// Code To Print value of a and b Before Method
        ob.meth(ob);
        System.out.println(""+ob.a+""+ob.b);// Code To Print value of a and b After Method
        

    }
}
