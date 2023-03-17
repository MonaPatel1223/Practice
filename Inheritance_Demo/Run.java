package Inheritance_Demo;

public class Run {
    public static void main(String[] args) {
        System.out.println("Car is parent class");
        Car c=new Car();
        c.Open_car();
        c.Start_engine();
        c.drive();
        c.Stop();
        c.Lock();

        System.out.println("BMW is child class");
        BMW b=new BMW();
        b.Open_car();
        b.Start_engine();
        b.drive();
        b.Stop();

        System.out.println("Tesla is child class");
        Tesla t=new Tesla();
        t.Open_car();
        t.Start_engine();
        t.drive();
        t.Stop();

        System.out.println("Honda is child class");
        Honda h =new Honda();
        h.Open_car();
        h.Start_engine();
        h.drive();
        h.Stop();


        B i =new B();
        i.Start();
        i.Stop();



    }
}

