public class Demo {
//     static {
//         System.out.println("Program start");
//     }
//     static {
//         System.out.println("Two");
//     }
//     static {
//         System.out.println("Three");
//     }
//     public static void main(String[] args) {
//         System.out.println("Hello Rutuja");
//     }
//     static{
//         System.out.println("program ends");
//     }
 

//when there are multiple static block inside one class block there static block executes sequentially and also static block will always executes first before the main method

{
    System.out.println("Start");
}

public static void main(String[] args) {
    Demo d1 = new Demo();
    System.out.println("End");
}}