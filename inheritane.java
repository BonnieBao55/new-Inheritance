public class inheritane {
    public static void main(String[] args) {
        System.out.println("This is after the exception");
    

    Student student = new Student("Bonnie");
    student.gpa = 3.0f;

    Instructor instructor = new Instructor("Donald");
    instructor.salary = 50000;

    //User user = new User("Justin");
    //System.out.println(user);

    System.out.println(student instanceof Student);
    System.out.println(student instanceof User);
    //System.out.println(instructor instanceof Student);
    System.out.println(instructor instanceof User);

    Triangle triangle = new Triangle(5,10);
    System.out.println(triangle.GetArea());

    Rectangle rectangle = new Rectangle(5,10);
    System.out.println(rectangle.GetArea());

    Circle circle = new Circle(5);
    System.out.println(circle.GetArea());


}
}
