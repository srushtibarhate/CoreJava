interface A1{
    void add(int x,int y);
}
interface B1 extends A1{
    void sub(int x,int y);
}

class demo3 implements B1{

    @Override
    public void add(int x, int y) {
       
        System.out.println(x+y);
    }

    @Override
    public void sub(int x, int y) {
    
        System.out.println(x-y);
            
        }
      
}
    

public class interfaceinhertance {
    public static void main(String[] args) {
        demo3 ob=new demo3();
        ob.add(400,200);
        ob.sub(90,10);
    }
}
