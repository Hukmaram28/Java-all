import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
import java.util.List;

public class Manifest {
    public static void main(String[] args){
        Student student1=new Student();
        student1.setter(1,10,"tanusha");
        Student student2=new Student();
        student2.setter(2,18,"shalini");
        Student student3=new Student();
        student3.setter(2,22,"shreelekhya");
        Student student4=new Student();
        student4.setter(3,15,"harsha");
        Student student5=new Student();
        student5.setter(3,15,"vineeth");
        List<Student> studentList=new ArrayList<Student>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        Collections.sort(studentList,new StudentSorter());
        System.out.println("\nSorted");
        for (int i=0; i<studentList.size(); i++)
            System.out.println(studentList.get(i).getid()+" "+studentList.get(i).getage()+" "+studentList.get(i).getname());
    }
}
