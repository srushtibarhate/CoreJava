package Abstractclass;
import java .util.Scanner;

abstract class A1{
    void show(){
        System.out.println("In A");
    }
    abstract void add(int x,int y);
    abstract void sub(int x,int y);
}
class B1 extends A1{

    @Override
    void add(int x, int y) {
        // TODO Auto-generated method stub
        System.out.println(x+y);
    }

    @Override
    void sub(int x, int y) {
        // TODO Auto-generated method stub
        System.out.println(x-y);
    }
    
}
public class abstractclass1 {
    public static void main(String[] args) {
        B1 ob=new B1();
        ob.show();
        ob.add(100,200);
        ob.sub(90,10);
    }
}
