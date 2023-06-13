package constructor;
class demo1{
    int i;
    int j;
    demo1(int x,int y){
        i=x;
        j=y;
        System.out.println("constructor with args called!!");
    }
    void add(){
        System.out.println(i+j);
        
    }
    }
public class parametercons {
    public static void main(String[] args) {
        demo1 ob1=new demo1(10,20);
        demo1 ob2=new demo1(30,40);
        ob1.add();
        ob2.add();
    }
}


