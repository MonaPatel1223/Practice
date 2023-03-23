package Encupation;

//every varible is private
    /* this keyword when we use  like class
    variable ,method variable also local variable are same
    then we have to differentiate them by using this keyword
     */

public  class Emp {

    private int acc_no;
    private int salary;


    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Emp e=new Emp();
        e.setAcc_no(23456);
        e.setSalary(15000);

        System.out.println(e.getAcc_no());
        System.out.println(e.getSalary());


        //e.setAcc_no(1000);
        //System.out.println(e.getAcc_no());







    }
}
