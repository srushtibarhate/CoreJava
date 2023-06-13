package constructor;
class demo2{
    int i;
    int j;
    demo2(int x,int y){
        i=x;
        j=y;
        System.out.println("constructor with args called!!");
    }
    demo2(){
        i=10;
        j=20;
        System.out.println("constructor without args called!!");
    }
    void add(){
        System.out.println(i+j);
        
    }
    }

public class constructoroverloading {
    public static void main(String[] args) {
        demo2 ob1=new demo2();
       demo2 ob2=new demo2(30,40);
       ob1.add();
       ob2.add();
   }
}

