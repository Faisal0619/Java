//dependent class
class employee1
{
    private Integer id;
    private String ename;

    //constructor

    public employee1(Integer id,String ename) {
        this.ename = ename;
        this.id = id;
    }
// 
    public Integer getId() {
        return id;
    }

    public String getEname() {
        return ename;
    }
 
}

class department
{
    private Integer deptno;
    private  String deptname;
    private String deptloc;


    //HAS-A VARIABLE
    employee1[] employees; 
//contructor injection
    public department(Integer deptno, String deptname,String deptloc,  employee1[] employees) {
        this.deptloc = deptloc;
        this.deptname = deptname;
        this.deptno = deptno;
        this.employees = employees;
    }public void display()
    {
        System.out.println("********Department Details ***************");
        System.out.println("DEPTNO   IS  :: "+ deptno);
        System.out.println("DEPTNAME IS :: "+ deptname);
        System.out.println("DEPTloc IS :: "+ deptloc);


        System.out.println("************************************");
        System.out.println("******** Employee Details***********");

        for (employee1 emp : employees) {
            System.out.println("EID IS :: "+emp.getId());
              System.out.println("Ename IS :: "+emp.getEname());
        }


    }




    
}






public class  one2manyassciation
{
    public static void main(String[] args) {
        //creating an dependent object using constructor injection
      employee1 emp1=new employee1(10,"faisal");
       employee1 emp2=new employee1(11,"kohli");
        employee1 emp3=new employee1(12,"scachin");
         employee1 emp4=new employee1(13,"sharma");
    
// creating an array to perform one-many assoaciation
    employee1[] employees=new employee1[4];
    employees[0]=emp1;
     employees[1]=emp2;
      employees[2]=emp3;
       employees[3]=emp4;


       //creating a tagetobject using constructor injection

 department dept= new department( 123, "bcci" ,  "dubai" , employees );

dept.display();






    }
}
