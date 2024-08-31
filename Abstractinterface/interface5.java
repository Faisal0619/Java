interface demo3
{
  
    void disp();
    static void show ()
    {
        System.out.println("im static method of an interface");
    }

    // java 9 feature
    default void shock2()
    {
        shock();

    }
    private void shock()
    {
        System.out.println("im private");
    }
}

public class interface5 {
    public static void main(String[] args) {
        
     demo3.show();


    }
}
