package method_overloading;

public class Lab {
    // decare a variable
    int x,y;
    double d;

    void M1(){
        x=10;
        y=20;
        System.out.println(x+y);
    }
    void M1( int a,int b){
        x=a;
        y=b;
        System.out.println(x+y);

    }
    void M1(int a,double c){
        x=a;
        d=c;
        System.out.println(x+c);

    }
    void M1(double c,int a){
        d=c;
        x=a;
        System.out.println(d+x);

    }


    public static void main(String[] args) {
        Lab l=new Lab();
        l.M1();//30
        l.M1(10,20);//30
        l.M1(10,20.5);//30.5
        l.M1(20.5,10);//30.5

    }
}
