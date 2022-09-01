class C{
    public static void print(){
        System.out.println(" Static Funtion is called");

    }
}
class B{
    public void print(){
        System.out.println(" Non Static Variable is Called");
    }

}
class StaticN{
    public static void main(String args[]){
        C.print();
        B obj = new B();
        obj.print();
    }
}