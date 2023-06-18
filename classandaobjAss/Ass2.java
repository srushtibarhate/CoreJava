import java.util.Scanner;
class demo2{
    String name;
    int balance;
    Scanner sc=new Scanner(System.in);
    void name(){
        System.out.println("Enter full name of customer");
        name=sc.next();
    }
    void balance(){
        System.out.println("Enter customer balance");
        balance=sc.nextInt();
    }
    void show(){
        System.out.println(name);
        System.out.println(balance);
    }
    }
    public class Ass2{
        public static void main(String[] args) {
            demo2 ob1=new demo2();
            demo2 ob2=new demo2();
            ob1.name();
            ob1.balance();
            ob2.name();
            ob2.balance();
            ob1.show();
            ob2.show();
        }
    }
    
