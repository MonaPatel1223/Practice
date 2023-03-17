package object;

public class Demo_Employee
{
    int e_id;// declare variable
    String e_name;

    public static void main(String[] args) {
        Demo_Employee emp=new Demo_Employee();// create an object
        emp.e_id=18;// pass the value in object
        emp.e_name="Mona Patel";

        //Print the value
        System.out.println("Emp_Id:"+emp.e_id);
        System.out.println("Emp_Name:"+emp.e_name);


    }
}

