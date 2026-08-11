package JAVA_13_OOPs;
public class JAVA_01_UserDefinedClass {
    public static class Employee{
        String name;
        int age;
        double salary;
        void print(){
            System.out.println("Name: "+name+" Age: "+age+" Salary: "+salary);
        }
    }
    static void main() {
        Employee e1 = new Employee();
        e1.name = "Peter";
        e1.age = 21;
        e1.salary = 25000.00;

        Employee e2 = new Employee();
        e2.name = "Tony";
        e2.age = 41;
        e2.salary = 50000.00;

        Employee e3 = new Employee();
        e3.name = "Steve";
        e3.age = 61;
        e3.salary = 35000.00;

        e1.print();
        e2.print();
        e3.print();
    }
}