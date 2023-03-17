package method;

public class Employee {
    // static method
    /*static void emp(){
        System.out.println("I am tester");
    }*/
    void emp(){
        System.out.println("I am mona");
    }

    public static void main(String[] args) {
        //emp();

        // crete object
        Employee e=new Employee();
        e.emp();
    }
}
