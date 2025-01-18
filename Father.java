public class Father {
    int age = 50; // Father's age
}

class Son extends Father {
    int age = 30; // Son's age

    void display() {
        int age = 10; // Local age variable

        // Print different age values
        System.out.println("Local age: " + age);
        System.out.println("Son's age: " + this.age);
        System.out.println("Father's age: " + super.age);
    }
}

public class Main {
    public static void main(String[] args) {
        Son s = new Son(); // Create instance of Son
        s.display(); // Call display method
    }
}
