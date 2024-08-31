class Alien3{

    private int age;
    private String name;
    public Alien3(){
        this(10,"telusko");
    }
    public Alien3(int age,String name)
    {
        this.age=age;
        this.name=name;
    }
    public Alien3(int age)
    {
        this();              // to call another contructor of same class
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    
}

public class constructor2{
    public static void main(String[] args){
Alien3 a1=new Alien3();
System.out.println(a1.getAge());
System.out.println(a1.getName());
Alien3 a2=new Alien3(5);
System.out.println(a2.getAge());
System.out.println(a2.getName());
    }}