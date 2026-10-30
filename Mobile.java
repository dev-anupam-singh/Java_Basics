public class Mobile {
    String brand;
    int year;

    void display() {
        System.out.println(brand);
    
    }
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();

        m1.brand = "samsung";
        m2.brand = "Apple";

        m1.display();
        m2.display();
    }
    
}
