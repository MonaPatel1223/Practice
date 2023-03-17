package object;

public class Student {

    // declare variable
    int Stu_id;
    String stu_Name;
    char grade;

    public static void main(String[] args) {
        // crete object
         Student stu=new Student();
         stu.Stu_id=10;
         stu.stu_Name="Mona";
         stu.grade='A';


        System.out.println(stu.Stu_id);
         // another way to print like sting concetition
        System.out.println("Student_Id:"+stu.Stu_id);//
        System.out.println("Student_Name:"+stu.stu_Name);
        System.out.println("Student_grade:"+stu.grade);



    }
}
