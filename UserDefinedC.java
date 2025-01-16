//User Defined Constructor

public class UserDefinedC {
     
       String name;
      
       public UserDefinedC() {
        name = "Suzuki";
       }
    
    void Display(){
        System.out.println(this.name);
    }
    public static void main(String[] args) {
        System.out.println("Start");
        UserDefinedC c1 = new UserDefinedC();
        c1.Display();
        System.out.println("End");
    }
}
