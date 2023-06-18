
class A1{
    void show(){
        System.out.println("In A");
    }
}

class B1 extends A1{
void show(){
    System.out.println("In B");
}
}


public class overrriding1 {
    public static void main(String[] args) {
         B1 ob=new B1();
         ob.show();
         ob.show();
    }
}
