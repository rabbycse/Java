class Person {
 
    // Instance variables (data or "state")
    String name;
    int age;
 
    // Classes can contain
 
    // 1. Data
    // 2. Subroutines (methods)
     
    void speak() {
        for(int i=0; i<3; i++) {
            System.out.println("My name is: " + name + " and I am " + age + " years old ");
        }
    }
     
    void sayHello() {
        System.out.println("Hello there!");
    }
}
 
public class Test {
 
    public static void main(String[] args) {
 
        // Create a Person object using the Person class
        Person p1 = new Person();
        p1.name = "Rabby";
        p1.age = 20;
        p1.speak();
        p1.sayHello();
 
        // Create a second Person object
        Person p2 = new Person();
        p2.name = "Gaus";
        p2.age = 20;
        p2.speak();
        p1.sayHello();
 
        System.out.println(p1.name);
 
    }
 
}
