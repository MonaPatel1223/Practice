package object;

public class Employee {
    //Variable declartion
   // int eid;
    //int e_salary;
    //String e_name;

    //Static method
    /* static void emp(int a,int b){
         System.out.println("Emp:"+a);
         System.out.println("Emp:"+b);
         //System.out.println("Employee reference");

    }*/
    int id;
    Employee(){
        id=10;
        id=20;
        //name ="Mona";

    }

    void emp(int a, double c){
        System.out.println("Emp:"+a);
        System.out.println("Emp:"+c);

    }
    void emp(double c,int a){
        System.out.println("Emp:"+c);
        System.out.println("Emp:"+a);
    }


    //Non static method

    /*void emp(){
        System.out.println("Employee data");
    }*/

    public static void main(String[] args) {
        Employee emp1=new Employee();
        /*emp1.eid=10;
        emp1.e_name="Mona patel";
        emp1.e_salary=30000;

        System.out.println("Emp:"+emp1.eid);
        System.out.println("Emp:"+emp1.e_name);
        System.out.println("Emp:"+emp1.e_salary);*/

        //Method access
        //emp.emp();
        //emp();

       // Employee e=new Employee();
        //emp(10,20);
        emp1.emp(10,10.5);
        emp1.emp(10.5,20);

        //Constructor access
        //Employee c=new Employee();
        System.out.println("Emp:"+emp1.id);





    }
}
