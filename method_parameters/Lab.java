package method_parameters;

public class Lab {
    // Sattic PAra

    int eid;
    String e_name;
    static void labDemo(int id,String name){
        System.out.println("Eid:"+id);
        System.out.println("e_name:"+name);


    }

    public static void main(String[] args) {
        labDemo(10,"Mona");

    }
}
