public class StudentTest {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.age=10;
        s1.marks=100;
        s1.name="Raj";
//        System.out.println(s1.name);
        Student s2=new Student(21,"Suhan",58);
        System.out.println(s2.name);
        Student s3=new Student(22,"Suhannam",585);
        System.out.println(s3.name);
    }
}
