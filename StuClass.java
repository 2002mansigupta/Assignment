package anudip;

class Student {
    private String name;
    private int age;
    private char grade;

    // Method to set and display student details
    public void student_details(int a, char g, String n) {
        name = n;
        age = a;
        grade = g;
        System.out.println("The details of the student are: Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}

public class StuClass {
    public static void main(String[] args) {
        Student s = new Student();
        s.student_details(22, 'A', "Mansi");
    }
}
