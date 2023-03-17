package method;

public class Lab {

    // Static-method
   /* static void labDemo (){
        System.out.println("I am Tester");
    }*/

    //Non-static Method
    void M1(){
        System.out.println("I am tester");
    }

    public static void main(String[] args) {
        //labDemo();
        Lab l=new Lab();
        l.M1();

    }
}
