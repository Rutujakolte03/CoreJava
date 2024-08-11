class Employee {
int Employee_Id;
String Employee_Name;
String Employee_Salary;
Employee () {

} 
Employee (int Employee_Id) {
    this.Employee_Id = Employee_Id;
    
} 
Employee (int Employee_Id, String Employee_Name) {
    this.Employee_Id = Employee_Id;
    this.Employee_Name = Employee_Name;
    
} 
    Employee(int Employee_Id, String Employee_Name, String Employee_Salary) {
        this.Employee_Id = Employee_Id;
        this.Employee_Name = Employee_Name;
        this.Employee_Salary = Employee_Salary;
    }
    public static void main(String[]args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee(10, "Sheela", "100000.00 Rs");
        Employee employee3 = new Employee(20, "Shakila", "200000.00 Rs");
        Employee employee4 = new Employee(30, "Rutu" , "1000.00 Rs");
        System.out.println("No-Argument Constructor");
        System.out.println("Employee-id : "+ employee1.Employee_Id);
        System.out.println("Employee-Name : " + employee1.Employee_Name);
        System.out.println("Employee-Salary : " + employee1.Employee_Salary);
        System.out.println("----------------------");
        System.out.println("1Formal-Argument Constructor");
        System.out.println("Employee-id : "+ employee2.Employee_Id);
        System.out.println("Employee-Name :"+ employee2.Employee_Name);
        System.out.println("Employee-Salary :"+ employee2.Employee_Salary);
        System.out.println("----------------------");
        System.out.println("2 Formal-Arguments Constructor");
        System.out.println("Employee-id : "+ employee3.Employee_Id);
        System.out.println("Employee-Name :"+ employee3.Employee_Name);
        System.out.println("Employee-Salary :"+ employee3.Employee_Salary);
        System.out.println("----------------------");
        System.out.println("3 Formal-Arguments Constructor");
        System.out.println("Employee-id : "+ employee4.Employee_Id);
        System.out.println("Employee-Name :"+ employee4.Employee_Name);
        System.out.println("Employee-Salary :"+ employee4.Employee_Salary);
    }
}
