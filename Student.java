public class Student {
    String name;
    int age;
    
    public Student(String name){
        this.name=name;
        age=0;
    }
    public Student(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void displayDetails(){
        System.out.println("Name:"+name + ",Age:"+ age);
    }
    public static void main(String[] args) {
        Student student1 = new Student("Rutuja");
        student1.displayDetails();
        
        Student student2 = new Student("Vrushi", 25);
        student2.displayDetails();
    }
}
