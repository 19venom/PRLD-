public class Student extends Person {

    private int studentNumber;
    private int[] marks;

    // Constructor
    public Student(String name, int age, int studentNumber, int[] marks) {
        super(name, age);
        this.studentNumber = studentNumber;
        this.marks = marks;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public int[] getMarks() {
        return marks;
    }

    // Calculate average
    public double calculateAverage() {

        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        return (double) total / marks.length;
    }

    // Determine pass or fail
    public String getStatus() {

        if (calculateAverage() >= 50) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }

    @Override
    public void displayDetails() {

        System.out.println("Student Number: " + studentNumber);
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Average: " + calculateAverage());
        System.out.println("Status: " + getStatus());
    }
}