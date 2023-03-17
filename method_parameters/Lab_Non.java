package method_parameters;

import object.Lab;

public class Lab_Non {
    void M2(int id,String name){
        System.out.println("eid:"+id);
        System.out.println("e_name:"+name);

    }
    public static void main(String[] args) {
        Lab_Non ln=new Lab_Non();
        ln.M2(10,"Mona");


    }
}
