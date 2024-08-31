  class demo1
{
    final int a=10;
  public void disp()
  {
    System.out.println("parent");
  }
}
class demo2 extends demo1
{ // cannot inherit 
 public void disp()                       // cannot inherit the class which is final 
  {                                       // method  participate in inheritance but cannot override
                                          // if we use final final keyword with varaible that will become constant
    System.out.println("child");
  }
}


public  class polymorfinal
{
    public static void main(String[] args) {
        demo2 d=new demo2();
        d.disp();
    }
}