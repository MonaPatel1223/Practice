package method_overloading;

   /*4 rules are applicable in overloading
-----------
1) Method names should be same
2) number of parameters should be different
3) Data type of parameters should be different
4) Order of parameters should be different
*/

public class Methodoverloading {
    int x,y,z;// parameters
    double d;


    void sum()
    {
        // asign data
        x=10;
        y=20;
        System.out.println(x+y);

    }
    void sum(int a,int b)//  number of parametrs are diff
    {
        x=a;
        y=b;
        System.out.println(x+y);
    }
    void sum(int a,double b)//  number of parametrs are same than we gonna chnage data type/should be diiff
    {
        x = a;
        d = b;
        System.out.println(x + d);
    }
    void sum(double b,int a)// if datatype are same than we have to change oder of datatype
    {

        x = a;
        d = b;
        System.out.println(x + d);
    }



    public static void main(String[] args) {
        Methodoverloading mo=new Methodoverloading();
        mo.sum();
        mo.sum(100,200);
        mo.sum(100,20.5);
        mo.sum(20.5,100);

    }
}
