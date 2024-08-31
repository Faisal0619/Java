



// contructor injection
// dependent object
class Branch
{
    private String bid;
    private String bloc;

    //  contructor injection

    public Branch(String bid, String bloc) {
        this.bid = bid;
        this.bloc = bloc;
    }

    public String getBid() {
        return bid;
    }



    public String getBloc() {
        return bloc;
    }


}
// target object
class student
{
    private Integer sid;
    private String sname;
    private Integer sage;

// HAS-A variable
private Branch branch;


    //contructor injection

    public student(Integer sid,  String sname,Integer sage,Branch branch) {
        this.sage = sage;
        this.sid = sid;
        this.sname = sname;
        this.branch=branch;
    }


    public void getStudentDetails1()
    {
            System.out.println("************* Student Details Are************");
            System.out.println("SID IS ::"+sid);
             System.out.println("Sname IS ::"+sname);
                 System.out.println("Sage IS ::"+sage);


                     System.out.println("--------------------");


                         System.out.println("Branch Details are");
                         System.out.println("Branch ID IS ::"+ branch.getBid());
                         System.out.println("Bname is :: "+ branch.getBloc());

                         

    }
}


public class many2oneassociation
{
    public static void main(String[] args) {
// creating  a dependent object
   Branch branch=  new  Branch("INO1","VJYNGR");

   //creating a target object
    student sb1=new student(10,"sachin",49,branch);
     student sb2=new student(11,"rachin",42,branch);
      student sb3=new student(12,"rohin",36,branch);

sb1.getStudentDetails1();
System.out.println("");

sb2.getStudentDetails1();
System.out.println("");

sb3.getStudentDetails1();
System.out.println("");

    }
    


}