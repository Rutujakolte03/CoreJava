import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    Employee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("No-argument constructor");

        System.out.print("Enter id: ");
        this.id = sc.nextInt();
        System.out.println("Employee id = " + id);

        sc.nextLine(); 
        System.out.print("Enter name: ");
        this.name = sc.nextLine();
        System.out.println("Employee name = " + name);

        System.out.print("Enter salary: ");
        this.salary = sc.nextDouble();
        System.out.println("Employee salary = " + salary + " Rs");
    }

    Employee(int id) {
        this.id = id;
        Scanner sc = new Scanner(System.in);
        System.out.println("1FA constructor");

        System.out.println("Employee id = " + id);

        System.out.print("Enter name: ");
        this.name = sc.nextLine();
        System.out.println("Employee name = " + name);

        System.out.print("Enter salary: ");
        this.salary = sc.nextDouble();
        System.out.println("Employee salary = " + salary + " Rs");
    }

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
        Scanner sc = new Scanner(System.in);
        System.out.println("2FA constructor");

        System.out.println("Employee id = " + id);
        System.out.println("Employee name = " + name);

        System.out.print("Enter salary: ");
        this.salary = sc.nextDouble();
        System.out.println("Employee salary = " + salary + " Rs");
    }

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        System.out.println("3FA constructor");

        System.out.println("Employee id = " + id);
        System.out.println("Employee name = " + name);
        System.out.println("Employee salary = " + salary + " Rs");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee em = new Employee();

        System.out.print("Enter id for constructor with id: ");
        int id = sc.nextInt();
        Employee em1 = new Employee(id);

        System.out.print("Enter id for constructor with id and name: ");
        id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        Employee em2 = new Employee(id, name);

        System.out.print("Enter id for constructor with id, name, and salary: ");
        id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        Employee em3 = new Employee(id, name, salary);
    }
}
