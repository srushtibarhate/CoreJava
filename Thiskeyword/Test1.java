package Thiskeyword;
class demo5{
    int i;
    demo5(int i){
        this.i=i;
    }
    void show(){
        System.out.println(i);
    }
    }

public class Test1 {
   public static void main(String[] args) {
    demo5 ob1=new demo5(10);
    ob1.show();
    
   } 
}
