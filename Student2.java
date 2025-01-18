public class Student2 {
    int age;

    Student2(int a) {
        age = a;
    }

    public static void main(String[] args) {
        Student2 s2 = new Student2(21);
        Student2 s3 = new Student2(22);

        System.out.println("Age:" + s2.age);
        System.out.println("Age:" + s3.age);

    }
}
