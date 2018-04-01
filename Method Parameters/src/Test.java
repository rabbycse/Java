class Person {
    private String name;
    private int age;
     
    public void setName(String name) {
        this.name = name;
    }
     
    public void setAge(int age) {
        this.age = age;
    }
     
    public String getName() {
        return name;
    }
     
    public int getAge() {
        return age;
    }
     
    public void setInfo(String name, int age) {
        setName(name);
        setAge(age);
    }
}
 
public class Test {
 
    public static void main(String[] args) {
     
        Person p = new Person();
         
        p.setName("Rabby");
        p.setAge(20);
         
        System.out.println(p.getName());
    }
 
}
