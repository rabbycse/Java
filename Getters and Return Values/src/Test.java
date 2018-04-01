class Person {
    String name;
    int age;
     
    void speak() {
        System.out.println("My name is: " + name);
    }
     
    int calculateYearsToRetirement() {
        int yearsLeft = 65 - age;
         
        return yearsLeft;
    }
     
    int getAge() {
        return age;
    }
     
    String getName() {
        return name;
    }
}
 
 
public class Test {
 
    public static void main(String[] args) {
        Person p1 = new Person();
         
        p1.name = "Rabby";
        p1.age = 20;
         
        // p1.speak();
         
        int years = p1.calculateYearsToRetirement();
         
        System.out.println("Years till retirements " + years);
         
        int age = p1.getAge();
        String name = p1.getName();
         
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }
 
}
