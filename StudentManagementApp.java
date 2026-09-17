public class StudentManagementApp {

    public static void main(String[] args) {

        // Advanced array
        Student[] students = new Student[3];

        // Creating students
        students[0] = new Student(
                "Lebogang",
                20,
                1001,
                new int[]{75, 68, 80}
        );

        students[1] = new Student(
                "Thabo",
                21,
                1002,
                new int[]{45, 52, 48}
        );

        students[2] = new Student(
                "Lebogang",
                19,
                1003,
                new int[]{88, 91, 79}
        );

        // Console report
        System.out.println("=================================");
        System.out.println("       STUDENT MANAGEMENT REPORT");
        System.out.println("=================================");

        // Loop through array
        for (Student student : students) {

            student.displayDetails();

            System.out.println("---------------------------------");
        }

        // Find highest average
        Student highest = students[0];

        for (Student student : students) {

            if (student.calculateAverage()
                    > highest.calculateAverage()) {

                highest = student;
            }
        }

        System.out.println("TOP STUDENT");
        System.out.println("Name: " + highest.getName());
        System.out.println("Average: "
                + highest.calculateAverage());

        System.out.println("=================================");
    }
}