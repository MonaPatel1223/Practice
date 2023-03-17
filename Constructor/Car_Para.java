package Constructor;

public class Car_Para {
    int id;
    String name;

    Car_Para( int eid,String Ename)
    {
       id=eid;
       name=Ename;
    }
    public static void main(String[] args) {
        Car_Para c=new Car_Para(10,"Mona");
        System.out.println(c.id);
        System.out.println(c.name);

    }
}
