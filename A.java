public class A {
    int age;
    A(int a){
        age = a;
    }
    public static void main(String[] args) {
        A s1 = new A(22);
        System.out.println(s1.age);
        A s2 = new A(25);
        System.out.println(s2.age);
    }
}
