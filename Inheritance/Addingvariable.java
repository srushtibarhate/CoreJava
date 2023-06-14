package Inheritance;
import java.util.Scanner;


class A1{
    int i;
    A1()
    {
        i=10;
        System.out.println("In A");
    }
}
class B1 extends A1
{
    int j;
    B1()
    {
        i=20;
        System.out.println("In B");
    }
    void add()
    {
        System.out.println( i + i);
    }
}
    

public class Addingvariable {
    public static void main(String[] args) {
        B1 ob =new B1();
        ob.add();
    }
}
