class hello
{
    public static void disp() {
        System.out.println("hello is parent");
    }
}
class hi extends  hello{
    public static void disp()
{
System.out.println("hi is hello");
}
}




public class methodhidding
{
    public static void main(String[] args) {
        // hi a=new hi();
        // a.disp();//hi is hello
        hello a=new hi();
        a.disp();// hello is parent
    }
}