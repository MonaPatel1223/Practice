package method;

public class Demo_nonStatic {
    // always use void when you use non-static method while crete a method
    void myMethod(){
        System.out.println("Name:"+"Mona");
    }

// call the method
    //first create object
    public static void main(String[] args) {
        Demo_nonStatic obj=new Demo_nonStatic();
        obj.myMethod();


    }
}
