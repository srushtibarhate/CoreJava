import java.util.Scanner;

class student2{
    private int id;
    private String name;
   public student2( int id,String name){
    this.id=id;
    this.name=name;
   }
@Override
public String toString() {
    
    return id+" "+name;
}

    
}
public class overriding2 {
    public static void main(String[] args) {
        student2 st=new student2(100,"abc");
System.out.println(st.toString());
System.out.println(st);

    }
}
