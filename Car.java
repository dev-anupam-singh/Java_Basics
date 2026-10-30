public class Car {

    String brand;
    int year;

    void display(){
        System.out.println(brand);
        System.out.println(year);
    }
    public static void main(String[] args) {
        
        Car c1 = new Car();
        Car c2 = new Car();

        c1.brand = "toyota";
        c1.year = 2022;

        c2.brand = "BMW";
        c2.year = 2024;

        c1.display();
        c2.display();
    }
    
}
