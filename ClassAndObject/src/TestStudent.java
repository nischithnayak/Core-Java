public class TestStudent {
    public static void main(String[] args) {
        System.out.println("Hello");
        Student s1=new Student();
        System.out.println(s1.age);
        System.out.println(s1.name);
        s1.age=22;
        s1.name="Nischith";
        System.out.println(s1.age);
        System.out.println(s1.name);
        s1.study();
        Student s2=new Student();
        System.out.println(s2.name);
        System.out.println(s2.age);
    }
}

