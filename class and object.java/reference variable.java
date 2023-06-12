class demo2 {
    int i;
    int j;
    void setij( int  x, int y ){
        i=x;
        j=y;
    }
    void add(){
System.out.println(i+j);
    }
}
class referencevariable {
    public static void main(String[] args) {
       demo2 ob1=new demo2();
       ob1.setij(10,20); 
       demo2 ob2=new demo2();
       ob1.setij(80,90);
       ob1.add();
        ob2.add();  

    }
}
    

    

