package Constructor;

public class Demo_Con {

    int i=10;// create parametrs

    Demo_Con(){
        i=5;
        i=20;
    }

    public static void main(String[] args) {
        Demo_Con obj=new Demo_Con();
        System.out.println(obj.i);
    }


}
