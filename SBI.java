import java.util.Scanner;
class Main {
    long Account_Number;
    String Account_Holder_Name;
    double Account_Balance;
    int IFSC_Code;
    public void AccountDetails() {
        System.out.println("Account_Number :" + Account_Number);
        System.out.println("Account_Holder_Name :" + Account_Holder_Name);
        System.out.println("Account_Balance :" + Account_Balance);
        System.out.println("IFSC_Code :" + IFSC_Code);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         Main account = new Main();
         System.out.println("Account_Number :");
         account.Account_Number = sc.nextLong();
         sc.nextLine();
         System.out.println("Account_Holder_Name :");
         account.Account_Holder_Name = sc.nextLine();
         sc.nextLine();
         System.out.println("Account_Balance :");
         account.Account_Balance = sc.nextDouble();
         sc.nextLine();
         System.out.println("IFSC_Code :");
         account.IFSC_Code = sc.nextInt();
         sc.nextLine();
        account.AccountDetails();
    }
}