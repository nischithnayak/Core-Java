public class PassingObject{
    public static void main(String[] args) {
        Student student=new Student();
        student.name="Nischith";
        student.age=30;
        StudentPrinter std=new StudentPrinter();
        std.printer(student);

    }
}
class StudentPrinter {
    void printer(Student student){
        System.out.println(student.age);
        System.out.println(student.name);
    }
}