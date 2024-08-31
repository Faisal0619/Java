class NegativeAgeException extends Exception{
    public NegativeAgeException (String message)
    {
        super (message);
    }
}

public  class ageValidatexceptionhandling
{

 public static  void validateAge(int age) throws NegativeAgeException{
     if(age<0)
{
    throw new NegativeAgeException("age cannot be negative");
}
else{
    System.out.println("Valid age: "+ age);
}
}

public static void main(String[] args) {
    try{
        validateAge(-5);
        {
            
        }
    }
    catch(NegativeAgeException e)
    {
        System.out.println(" Caught exception : "+ e.getMessage());
    }
    try{
        validateAge(25);
    }
    catch(NegativeAgeException e)
    {
        System.out.println(" Caught exception : "+ e.getMessage());
    }
}
}