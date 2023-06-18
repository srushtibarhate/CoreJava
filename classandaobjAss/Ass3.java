import java.util.Scanner;
class demo3{
    int i;
    int j;
    void setij(int x,int y){
     i=x;
     j=y;
    }
    void add(){
System.out.println(i+j);
    }
}

public class Ass3 {
    public static void main(String[] args) {
        demo3 ob1= new demo3();
        ob1.setij(10,20);
        demo3 ob2= new demo3();
        ob2.setij(80,90);
        ob1.add();
        ob2.add();
    }
}
