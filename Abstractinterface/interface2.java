interface Calc1{
        void add(int a , int b);

}

interface Calc2{
int sub(int a,int b);

}

class MYCalc implements  Calc1 ,Calc2
{
public void add(int a,int b)
{
    int c=a+b;
    System.out.println(c);
}
 public int sub(int a,int b)
{
return a-b;
}
}













public class interface2
{
    public static void main(String[] args) {
   MYCalc c=new MYCalc();
   c.add(10, 20);
   System.out.println(c.sub(20, 10));



    }}