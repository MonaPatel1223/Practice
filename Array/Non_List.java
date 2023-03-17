package Array;

import java.util.ArrayList;

public class Non_List {
    void xyz(){
        ArrayList arrayList=new ArrayList();
        arrayList.add(20);
        arrayList.add(20.5);
        arrayList.add("Mona");
        arrayList.add("A");

        //System.out.println(arrayList.size());//4
       // System.out.println(arrayList.get(2));//Mona
        System.out.println(arrayList.remove(1));
        System.out.println(arrayList.size());
    }
    public static void main(String[] args) {
        Non_List n=new Non_List();
        n.xyz();

    }
}
