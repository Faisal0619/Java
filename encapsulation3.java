


class Fan
{
    private int cost;
    private String brand;

    public void setCost(int cost)
    {
        //cost=cost   ---> shadowing problem
       this.cost=cost;

    }
    public void setBrand(String brand)
    {
        //brand = brand  ----> shadowing problem
        this.brand=brand;
    }
    public int getCost()
    {
        return cost;
    }
    public String getBrand()
    {
        return brand;
    }
}






public class encapsulation3{
    public static void main(String[] args){
Fan f1=new Fan();
f1.setCost(1000);
f1.setBrand("Bajaj");
System.out.println(f1.getCost());
System.out.println(f1.getBrand());



    }}