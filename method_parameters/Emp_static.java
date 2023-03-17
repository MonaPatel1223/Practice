package method_parameters;

public class Emp_static {
    // static method using para
    /*static void Emp( int eid,String ename){
        System.out.println("Emp_id:"+eid);
        System.out.println("Emp_name:"+ename);
    }*/

    // non static by using para
    void Emp(int eid, String ename){
        System.out.println("Emp_id:"+eid);
        System.out.println("Emp_name:"+ename);

    }


    public static void main(String[] args) {
        //Emp(10,"Mona");
         Emp_static e=new Emp_static();
         e.Emp(10,"Mona");

    }
}
