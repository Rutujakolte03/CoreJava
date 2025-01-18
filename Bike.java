class Bike {
    //parameterized Custom Constructor
    Bike(int cost) //cost=1000
    {
        System.out.println("Cost: "+ cost);
    }
    public static void main(String[] args) {
        Bike b = new Bike(1000);
    }
}