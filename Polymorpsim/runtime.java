package Polymorpsim;
import java.util.Scanner;

class A1{
    void read(){
        System.out.println("Read from file");
    }
}
class B1 extends A1{
void read(){
    System.out.println("Read from usb drive");
}
}
class C1 extends B1{
    void read(){
        System.out.println("Read from network");
    }
}
public class runtime {
    static void show(A1 r){
        r.read();
    }
    public static void main(String[] args) {
        A1 ob1=new A1();
        B1 ob2=new B1();
        C1 ob3=new C1();
        show(ob1);
        show(ob2);
        show(ob3);
    }
}

    

    

