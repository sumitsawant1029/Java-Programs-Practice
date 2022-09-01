class A {
    private static int a = 10;
    private static int b=20;
    public static void Pt(){
        System.out.println(" "+a+" "+b);
    }    
}


class DataHiding {
    public static void main (String args[]){
        A.Pt();
    }
}