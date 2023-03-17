package method_parameters;

public class Demo_StaticPara {
    static void myMethod(String stu_name, int stu_id )
    {
        System.out.println("FName:" +stu_name);
        System.out.println("S_Id:" +stu_id);

    }
    // // static parameters method
    /*static void myMethod1(String name,String area,String street){
        System.out.println("Name:"+name);
        System.out.println("Area:"+area);
        System.out.println("street:"+street);
    }*/


    public static void main(String[] args) {

        myMethod("Mona Patel",10);





    }
}
