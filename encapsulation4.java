class Alien{
   private   int age;
   private String name;

   Alien(int age , String  name)
   {
    this.age = age;
    this.name=name;
   }




    public int getAge() {
        return age;
    }

    // public void setAge(int age) {
    //     this.age = age;
    // }

    public String getName() {
        return name;
    }

    // public void setName(String name) {
    //     this.name = name;
    // }

 
}

public class encapsulation4{
    public static void main(String[] args){
Alien f1=new Alien(10,"faisal");
System.out.println(f1.getAge());
System.out.println(f1.getName());
    }}