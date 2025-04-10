public class CommandLineInput {
    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Please provide all required information:");
            System.out.println("Usage: java CommandLineInput <Name> <UniversityRollNo> <Course> <Semester>");
            return;
        }
        String name = args[0];
        String universityRollNo = args[1];
        String course = args[2];
        String semester = args[3];
        System.out.println("Name: " + name);
        System.out.println("UniversityRollNo: " + universityRollNo);
        System.out.println("Course: " + course);
        System.out.println("Semester: " + semester);
    }
}
