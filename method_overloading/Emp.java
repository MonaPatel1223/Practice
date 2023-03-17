package method_overloading;

public class Emp {
    // decare a para
    int x,y,z;
    double d;

    // crete a method but should be same name
    void myMethod()
    {
     x=10;
     y=20;
        System.out.println("Sum number:"+(x+y));
    }
    // para
    void myMethod(int a,int b)
    {
        x=a;
        y=b;
        System.out.println("sum number:"+(x+y));

    }
    void myMethod(int a,double b)
    {
        x=a;
        d=b;
        System.out.println("sum of number:"+(x+d));
    }
    void myMethod(double b,int a)
    {
        d=b;
        x=a;
        System.out.println("sum number:"+(d+x));
    }


    public static void main(String[] args) {
        Emp e= new Emp();
        e.myMethod();//30
        e.myMethod(10,20);//30
        e.myMethod(10,20.5);//30.5
        e.myMethod(20.5,10);//30.5

    }


}
