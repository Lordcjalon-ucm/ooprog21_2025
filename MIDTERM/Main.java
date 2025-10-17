import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        while (true) {
            String menu = "STUDENT APP\n\n"
                    + "[1] Create Record\n"
                    + "[2] Update Name\n"
                    + "[3] Set Course\n"
                    + "[4] Show Record\n"
                    + "[0] Exit";
            String choice = JOptionPane.showInputDialog(menu);
            if (choice == null) break;

            switch (choice.trim()) {
                case "1":
                    student.set(
                            ask("ID:"),
                            ask("First Name:"),
                            ask("Middle Name (optional):"),
                            ask("Last Name:"),
                            ask("Suffix (optional):"),
                            askInt("Age:"),
                            askInt("Year Level:"), 
                            ask("Phone:"),
                            ask("Email:")
                    );
                    JOptionPane.showMessageDialog(null, "Student Record Created.");
                    break;

                case "2":
                    String newFirstName = ask("Enter New First Name:");
                    if (newFirstName != null)
                        student.setName(newFirstName);
                    break;

                case "3":
                    String[] courses = {"BSIT", "BSCS", "ACT", "BSME", "BSCE", "NONE"};
                    String courseCode = (String) JOptionPane.showInputDialog(
                            null,
                            "Select Course:",
                            "Set Course",
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            courses,
                            courses[0]
                    );
                    student.setCourseByCode(courseCode);
                    if (courseCode != null)
                        JOptionPane.showMessageDialog(null, "Course Updated.");
                    break;

                case "4":
                    JOptionPane.showMessageDialog(null, student.details(), "Student Record", JOptionPane.PLAIN_MESSAGE);
                    break;

                case "0":
                    return;
            }
        }
    }

    private static String ask(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }

    private static int askInt(String prompt) {
        try {
            return Integer.parseInt(JOptionPane.showInputDialog(prompt));
        } catch (Exception e) {
            return 0;
        }
    }.
}
