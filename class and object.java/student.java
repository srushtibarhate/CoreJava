import java.util.Scanner;
public class student{
  private String fname;
  private String lname;
  private int year;
  private String branch;
  private String getname(){
    return fname;
  }
public String getFname() {
    return fname;
}
public void setFname(String fname) {
    this.fname = fname;
}
public String getLname() {
    return lname;
}
public void setLname(String lname) {
    this.lname = lname;
}
public int getYear() {
    return year;
}
public void setYear(int year) {
    this.year = year;
}
public String getBranch() {
    return branch;
}
public void setBranch(String branch) {
    this.branch = branch;
}
}
class student1{
    public static void main(String[] args) {
        student st1=new student();
        st1.setFname("srushti");
        st1.setLname("barhate");
        st1.setYear(2);
        st1.setBranch("It");
    
       System.out.println(st1.getFname());
       System.out.println(st1.getLname());
       System.out.println(st1.getYear());
       System.out.println(st1.getBranch());
        
    }
}


  
