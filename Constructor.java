class Const {
    Const(){// Default COnstructor
        System.out.println(" Default Constructor Called");
    }
    Const(int x){// Parametrized Constructor
        System.out.println(""+x);
    }
}
class Constructor{
    public static void main(String args[]){
        Const obj = new Const();
        Const obj1 = new Const(10);

    } 
}