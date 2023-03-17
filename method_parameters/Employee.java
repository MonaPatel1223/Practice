package method_parameters;

public class Employee {
    // static parameters
    static void Emp(String E_name, int E_id)
    {
        System.out.println("Emp_Name:"+E_name);
        System.out.println("Emp_Id:"+E_id);
    }

    public static void main(String[] args) {
        Emp("Mona Patel",10);

    }

}
