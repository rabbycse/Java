class Student {
    private String name;
    private int age;
     
    public Student() {
        this("Rabby", 0);
         
        System.out.println("Constructor running!");
    }
     
    public Student(String name) {
        this(name, 0);
         
        System.out.println("Second constructor running");
        // No longer need following line, since we're using the other constructor above.
        //this.name = name;
    }
     
    public Student(String name, int age) {
         
        System.out.println("Third constructor running");
        this.name = name;
        this.age = age;
    }
}
 
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
 
        Student s2 = new Student("Mou",20);
         
        Student s3 = new Student("Zarin", 20);
    }
 
}
