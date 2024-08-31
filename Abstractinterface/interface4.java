

 interface  demo1
{
    void disp();
  default void show()
  {
    System.err.println("hello show");
  }

}

class  demo2 implements demo1
{
    public void disp()
    {
      System.out.println(" implementing display");
    }
     public  void show()
    {
      System.err.println("hello demo2");
    }

}


public class interface4 {
    public static void main(String[] args) {
          demo1 d=new demo2();
          d.disp();
          d.show();
    }
}
