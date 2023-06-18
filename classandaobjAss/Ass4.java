import java.util.Scanner;
class stude{
    int id;
    String name,stream;
    Scanner sc=new Scanner(System.in);
    stude(){
        System.out.println("Enter student id");
        id=sc.nextInt();
        System.out.println("Enter student stream");
        name=sc.next();
    }
}
class graduation extends stude{
graduation(){
    System.out.println("enter student stream");
}
void display(){
    System.out.println("student id"+id);
System.out.println("student name"+name);
System.out.println("student stream"+stream);


}
}
public class Ass4 {
    public static void main(String[] args) {
        graduation ob1=new graduation();
        ob1.display();
    }
}
