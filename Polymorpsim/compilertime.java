package Polymorpsim;
import java.util.Scanner;
class demo1{
    
   void add(int x,int y){
    System.out.println("In add function called!!");
    System.out.println(x+y);
   }
   void add (float x, float y){
    System.out.println("Float add functon called!!");
    System.out.println(x+y);

   }
}
public class compilertime {
    public static void main(String[] args) {
        demo1 ob=new demo1();
        ob.add(1.2f,2.3f);
        ob.add(100,200);
    }
}
