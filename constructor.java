class Alien3{

    private int age;
    private String name;

public Alien3(int age,String name){
    this();
    this.age=age;
    this.name=name;                         // Parameterized constructor
}
public Alien3(){
    /* constructor overloading*/

    age=20;
    name="type";

}
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}


public class constructor{
    public static void main(String[] args){
  Alien3 A1=new Alien3(3,"faisal");
  System.out.println(A1.getAge());
  System.out.println(A1.getName());
   Alien3 A2=new Alien3();              
              /* now jvm will not include zero parameterized constructor,JVM will only include Zero Parameterized constructor if and only if programmer has not specified any constructor  at all */
    System.out.println(A2.getAge());
  System.out.println(A2.getName());
    }}