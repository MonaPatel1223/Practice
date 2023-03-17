package Array;

import java.util.ArrayList;

public class ListConcept {

    // ArrayList by using static method
      static void mymethod(){
        ArrayList arrayList=new ArrayList();
        arrayList.add(100);
        arrayList.add(10.20);
        arrayList.add("Mona");
        arrayList.add('A');
        arrayList.add(true);

          System.out.println(arrayList.get(2));//Mona
          System.out.println(arrayList.size());//5
          System.out.println(arrayList);// all value print
          System.out.println(arrayList.remove(2));
          System.out.println(arrayList.size());

    }
    public static void main(String[] args) {
        //Demo_ArrayListconcept a=new Demo_ArrayListconcept();
        mymethod();

    }
}
