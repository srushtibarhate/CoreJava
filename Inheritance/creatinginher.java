package Inheritance;
import java.util.Scanner;
class a{
    void show(){
        System.out.println("In A");
        
    }
    }
 class b extends a{
    void disp(){
        System.out.println("In B");
    }
 }
    



public class creatinginher {
   public static void main(String[] args) {
    b ob=new b();
    ob.show();
    ob.disp();
   } 
}
