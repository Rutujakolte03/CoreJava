public class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Rutuja", 120090.00);
        Employee e2 = new Employee(201, "Shraddha", 8000.09);
        System.out.println("Employee Details");
        System.out.println("======================");

        System.out.println("Employee Name:" + e1.name);
        System.out.println("Employee Salary:" + e1.salary);
        System.out.println("=======================");

        System.out.println("Employee Id:" + e2.id);
        System.out.println("Employee Name:" + e2.name);
        System.out.println("Employee Salary:" + e2.salary);

    }
}

