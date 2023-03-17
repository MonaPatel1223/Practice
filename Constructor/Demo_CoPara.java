package Constructor;

public class Demo_CoPara {
  int eid;
  String ename;

  Demo_CoPara(int id, String name)
  {
      eid=id;
      ename=name;

  }

    public static void main(String[] args) {
     Demo_CoPara con=new Demo_CoPara(10,"Mona");
      System.out.println(con.eid+" "+con.ename);

    }
}
