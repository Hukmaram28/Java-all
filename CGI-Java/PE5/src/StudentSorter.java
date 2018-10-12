import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        int age1 = s1.getage();
        int age2 = s2.getage();
        if(age1!=age2){
            return age2-age1;
        }
        if(s1.getname()!=s2.getname()){
            return s2.getname().compareTo(s1.getname());
        }
        else{
            return s2.getid()-s1.getid();
        }
    }
}
