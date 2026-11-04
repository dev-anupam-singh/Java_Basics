public class Employee {
    
    String name;
    double salary;

    void display(){
        System.out.println("Name:"+ name);
        System.out.println("Salary:"+ salary);
    }
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.name = "Anupam";
        e1.salary = 25000;

        e2.name = "Janu";
        e2.salary = 20000;

        e1.display();
        e2.display();
    }
    
}
