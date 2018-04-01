class Student {
     
    private int id;
    private String name;
     
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
     
    public String toString() {
         
        return String.format("%-4d: %s", id, name);
         
        /*
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);
         
        return sb.toString();
        */
    }
}
 
public class Test {
 
    public static void main(String[] args) {
        Student s1 = new Student(7, "Rabby");
        Student s2 = new Student(5, "Gaus");
         
        System.out.println(s1);
        System.out.println(s2);
    }
}
