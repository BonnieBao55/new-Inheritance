import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        // TODO Auto-generated method stub
        return student1.GetName().compareTo(student2.GetName());
    }
}
