package method_parameters;

public class Demo_NonStaticPara {
    // non-static Method
    void myMethod(String Fame,int id)
    {
        System.out.println("Fame:"+Fame);
        System.out.println("Id:"+id);
    }

    public static void main(String[] args) {
        // create object
        Demo_NonStaticPara obj=new Demo_NonStaticPara();
        obj.myMethod("Mona patel",10);

    }
}

