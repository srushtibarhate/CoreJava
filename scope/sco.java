package scope ;
class demo3{
    int i=100;
    void show(){
        int i=200;
        System.out.println(i);
    }
}
 class sco
 {
    public static void main(String[] args) {
        demo3 ob1=new demo3();
        ob1.show();
    }
}
