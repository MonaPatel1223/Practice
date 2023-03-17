package Constructor;

public class Lab {
    int id;
    String name;

    Lab(){
        id=10;
        name="Mona";
    }

    public static void main(String[] args) {
        Lab c=new Lab();

        System.out.println(c.id);
    }
}
