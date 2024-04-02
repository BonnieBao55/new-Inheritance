import java.util.ArrayList;

public class inheritane {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(3.0);
        SavingsAccount savingsAcct = new SavingsAccount(2.1);
        savingsAcct.deposit(500);
        savingsAcct.withdraw(10);
        System.out.println(savingsAcct.GetBalance());

        ArrayList<Student> student = new ArrayList<Student>();
        student.add(new Student("Paul"));
        student.add(new Student("Peter"));
        student.add(new Student("Parker"));

        student.sort(new StudentComparator());

        for(Student student0 : student){
            System.out.println(student0.GetName());
        }





}
}
