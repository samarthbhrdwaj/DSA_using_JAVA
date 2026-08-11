package JAVA_13_OOPs;
class Employee{
    private String name;
    private int age;
    String printName(){
        return name;
    }
    int printAge(){
        return age;
    }
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
}
public class JAVA_03_Private {
    static void main() {
        Employee e1 = new Employee();
        e1.setAge(25);
        e1.setName("Peter");
        int e1A = e1.printAge();
        String e1N = e1.printName();
        System.out.println("Name: "+e1N+" Age: "+e1A);
    }
}