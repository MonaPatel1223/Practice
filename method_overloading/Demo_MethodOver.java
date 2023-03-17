package method_overloading;

public class Demo_MethodOver
{
    int x,y;
    double d;

    // same mathod name
    void myMethod()
    {
        x=10;
        y=20;
        System.out.println(x+y);
    }
    void myMethod(int a,int b)
    {
        x=a;
        y=b;
        System.out.println("sum of number:"+(x+y));
    }
    void myMethod( int a,double b)
    {
        x=a;
        d=b;
        System.out.println(x+y);
    }
    void myMethod(double b,int a)
    {
        d=b;
        x=a;
        System.out.println(d+x);

    }


    public static void main(String[] args) {
        // create object
        Demo_MethodOver Mo=new Demo_MethodOver();
        Mo.myMethod();
        Mo.myMethod(10,20);
        Mo.myMethod(10,20.5);
        Mo.myMethod(20.5,10);



    }

}
