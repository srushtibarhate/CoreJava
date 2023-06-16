package TypeOfInhertance;
import java.util.Scanner;
 
class student{
    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class mark extends student{
    private int m1;
    private int m2;
     public int getm1(){
        return m1;

       
     }
    public int getM1() {
        return m1;
    }
    public void setM1(int m1) {
        this.m1 = m1;
    }
    public int getM2() {
        return m2;
    }
    public void setM2(int m2) {
        this.m2 = m2;
    }
}



    

public class Singleinherit {
    public static void main(String[] args) {

         mark ob=new mark();
         ob.setId(1);
         ob.setName("srushti");
         ob.setM1(90);
         ob.setM2(80);

System.out.println(ob.getId());
System.out.println(ob.getName());
System.out.println(ob.getm1());
System.out.println(ob.getM2());


    }
}
