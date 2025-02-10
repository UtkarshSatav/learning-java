public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "John";
        s1.age = 20;
        System.out.println("Student details are:");
        System.out.println("id: " + s1.id);
        System.out.println("name: " + s1.name);
        System.out.println("age: " + s1.age);
        System.out.println("college: " + Student.college);
    }
}

class Student {
    int id;
    String name;
    static String college = "ITM";
    int age;
}