


// when we create object of the subclass .it calls the constructor of super class also


class x1
{
public x1()
{
    super();
    System.out.println("in x1");
}

    public x1(int i)
    {
        super();
        System.out.println("in x1 int");
    }

}

class y  extends x1
{
    public y()
    {
        super();
 System.out.println("in y");
    }

    public y(int i)
    {
        super(9);
        System.out.println("in y int");
    }
}


public  class inheritance3
{
    public static void main(String[] args) {
        
        y obj=new y(7); //
    }
}