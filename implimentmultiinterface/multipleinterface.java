interface A1{
    void add(int x,int y);
    }
    interface B1{
        public abstract void sub(int x,int y);

    }
class demo2 implements A1,B1{

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
class multipleinterface{
    public static void main(String[] args) {
        demo2 ob=new demo2();
        ob.add(100,200);
        ob.sub(90,100);
    }
}



