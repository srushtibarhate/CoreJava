package scope ;
class demo4 {


int i;
demo4(int i){
i=1;
}
void show(){
    System.out.println(i);
}
}

public class scop2 {
    public static void main(String[] args) {
        demo4 ob1=new demo4(10);
        ob1.show();
    }
}
