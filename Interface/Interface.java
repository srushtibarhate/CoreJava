interface A1{
void add(int x,int y);
void sub(int x,int y);
}
class demo1 implements A1{

    @Override
    public void add(int x, int y) {
        // TODO Auto-generated method stub
        System.out.println(x+y);
    }

    @Override
    public void sub(int x, int y) {
        // TODO Auto-generated method stub
        System.out.println(x-y);
    }
    
}
class Interface{
    public static void main(String[] args) {
        demo1 ob=new demo1();
        ob.add(100,200);
        ob.sub(90,10);
    }
}