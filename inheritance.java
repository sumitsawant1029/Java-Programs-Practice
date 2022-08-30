class A{
    public void print(){
        System.out.println(" Hello I Am Class A");
    }
}
class B extends A{
    public void print1(){
        System.out.println("I AM Class B");
    }
}
class inheritance{
    public static void main(String arg[]){
        B obj=new B();
        obj.print();
        obj.print1();
    }
}