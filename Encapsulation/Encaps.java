package Encapsulation;
 import java.util.Scanner;

 class student{
    private int id;
    private String name;
    public int getid(){
     return id;
    }
public void setid(int id){
    this.id=id;

}
public String getname(){
   return name;
}
   

public void  setname(String name){
    this.name=name;
    
}
}

     



public class Encaps {
    public static void main(String[] args) {
        student st=new student();
        st.setid(100);
        st.setname("abc");
        int x=st.getid();
        String n=st.getname();
        System.out.println("id"+ x);
        System.out.println("name"+n);
    }
}
