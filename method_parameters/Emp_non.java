package method_parameters;

public class Emp_non {
    // non-static method
    void Emp(String eName,int eid)
    {
        System.out.println("Emp_Name:"+eName);
        System.out.println("Emp_id:"+eid);
    }
    public static void main(String[] args) {
        // create object
        Emp_non emp=new Emp_non();
        emp.Emp("Mona",10);

    }
}
