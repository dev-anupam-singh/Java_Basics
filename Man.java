public class Man {
    //constructor overloading
    String name;
    double weight;

    //constructor 1
    Man(){
        name = "unknown";
        weight = 0;
    }
    //constructor 2
    Man (String name){
        this.name = name;
        weight= 0;
    }
    //constructor 3
    Man (String name,double weight){
        this.name = name;
        this.weight= weight;
    }
    // constructor 4
    Man (double weight){
        name = "not given";
        this.weight = weight;
    }
    void display(){
        System.out.println(name);
        System.out.println(weight);
    }
    public static void main(String[] args) {
        Man m1 = new Man();
        Man m2 = new Man("Anupam");
        Man m3 = new Man("Rahul",85);
        Man m4 = new Man(56);

        m1.display();
        m2.display();
        m3.display();
        m4.display();
    }
    
}
