
 class demo1 {
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
class addingvariable {
    public static void main(String[] args) {
        demo1 ob1=new demo1();
        ob1.setij(10,20);
        demo1 ob2=new demo1();
        ob2.setij(80,90);
             ob1.add();
             ob2.add();
        }
    }





