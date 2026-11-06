package module_2;

class Student {
    // Instance variable: Each student gets their own unique name
    String name;

    // Static variable: Shared by ALL student objects to track total count
    static int totalStudents = 0;

    // Constructor runs every time a new student is created
    public Student(String name) {
        this.name = name;
        totalStudents++; // Increments the shared blackboard variable
    }
}

public class static_variable {
    public static void main(String[] args) {
        // Create three separate student objects
        Student s1 = new Student("Rohan");
        Student s2 = new Student("Smitha");
        Student s3 = new Student("Amit");
        Student s4 = new Student("Abel");

        // Accessing the instance variable requires the specific object name
        System.out.println("First student's name: " + s1.name); // Outputs: Rohan

        // Accessing the static variable directly via the Class name
        System.out.println("Total students created: " + Student.totalStudents); // Outputs: 3
    }
}

