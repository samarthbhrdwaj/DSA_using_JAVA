package JAVA_18_Heap;

import java.util.Arrays;

class Student implements Comparable<Student>{
    String name;
    int age;
    double gpa;
    Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
//    public int compareTo(Student s){
////        return Double.compare(this.gpa, s.gpa); // increasing
//         return Double.compare(s.gpa, this.gpa); // decreasing
//    }
    public int compareTo(Student s){
        if(this.age == s.age)
            return Double.compare(this.gpa, s.gpa);
        return Double.compare(this.age, s.age);
    }
//    public int compareTo(Student s){
//        return (int)(this.name.charAt(0) - s.name.charAt(0));
//    }
}
public class JAVA_02_Comparable {
    static void main() {
        Student s1 = new Student("Ram", 20, 8.5);
        Student s2 = new Student("Shyam", 18, 8.7);
        Student s3 = new Student("Sagar", 25, 8.2);
        Student s4 = new Student("Madhur", 19, 9.5);
        Student s5 = new Student("Harsh", 22, 7.5);
        Student[] arr = {s1, s2, s3, s4, s5};
        Arrays.sort(arr);
        for(Student s : arr){
            System.out.println(s.name+" "+s.age+" "+s.gpa);
        }
    }
}
