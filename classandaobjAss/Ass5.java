import java.util.Scanner;

class demo5{

    int classyear;
    String Firstname,lastname;
    Scanner sc=new Scanner(System.in);

    void year(){
        System.out.println("enter class year");
        classyear=sc.nextInt();

    }
    void first(){
        System.out.println("enter first name");
       Firstname=sc.next();

    }
    void last(){
        System.out.println("enter last name");
        lastname=sc.next();

    }

    void show(){
        System.out.println(classyear);
        System.out.println(Firstname);
        System.out.println(lastname);
    }
    }
public class Ass5 {
    public static void main(String[] args) {
        demo5 ob1=new demo5();
        ob1.year();
        ob1.first();
        ob1.last();
        ob1.show();
    }
}
