package method;

public class Car {
    // static method
    /*static void myMethod(){
        System.out.println("I am tester");
    }*/
    void myMethod(){
        System.out.println("I am tester");
    }


    public static void main(String[] args) {
        //myMethod();

        // non static method
        // crete object
        Car c=new Car();
        c.myMethod();

    }
}
