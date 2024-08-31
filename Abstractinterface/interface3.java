interface Calc5{
        void add();

}
class  Calc6{

int sub(){
    int a=20;
    int b=30;
 return a-b;
   
}

}

class MYCalc1  extends Calc6  implements  Calc5
{
public void add()
{
    int a=5;
    int b=6;
    int c=a+b;
    System.out.println(c);
}
}

public class interface3
{
    public static void main(String[] args) {
   MYCalc1 c=new MYCalc1();
   c.add();
   System.out.println(c.sub());
    }}