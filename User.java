import java.time.LocalDate;

enum Classes {PROGRAMMING, ALGORITHMS, GAME_DESIGN, CALCULUS}
public abstract class User {
    static int globalId;
    String name;
    LocalDate dob;
    int id;
    Class[] classes;
    String email;

    public User(String name){
        System.out.println("Called the User Constructor");
        this.name = name;
        this.id = ++globalId; 
    }

    public String GetName(){
        return this.name;
    }
}
