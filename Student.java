public class Student {

    String name;
    double marks;

    Student(String name , double marks){
        this.name = name;
        this.marks = marks;
    }
    void display(){
        System.out.println(name);
        System.out.println(marks);
    }
    public static void main(String[] args) {
        Student s1 = new Student("Anupam", 60);
        Student s2 = new Student("Rahul", 85);

        s1.display();
        s2.display();
    }
    
}
