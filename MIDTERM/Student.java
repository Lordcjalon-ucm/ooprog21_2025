public class Student {
    private String id = "", fName = "", mName = "", lName = "", suffix = "", phone = "", email = "";
    private int age = 0, year = 0;
    private Course course = new Course();

    public void set(String id, String fn, String mn, String ln, String sx, int age, int y, String p, String e) {
        this.id = safe(id);
        this.fName = safe(fn);
        this.mName = safe(mn);
        this.lName = safe(ln);
        this.suffix = safe(sx);
        this.age = age;
        this.year = y;
        this.phone = safe(p);
        this.email = safe(e);
    }

    public void setName(String f) {
        this.fName = safe(f);
    }

    public void setCourseByCode(String code) {
        if (code == null) return;

        switch (code) {
            case "BSIT":
                this.course = new Course(code, "Bachelor of Science in Information Technology",
                        new Department("College of Computer Studies"));
                break;
            case "BSCS":
                this.course = new Course(code, "Bachelor of Science in Computer Science",
                        new Department("College of Computer Studies"));
                break;
            case "ACT":
                this.course = new Course(code, "Associate of Computer Technology",
                        new Department("College of Computer Studies"));
                break;
            case "BSME":
                this.course = new Course(code, "Bachelor of Science in Mechanical Engineering",
                        new Department("College of Engineering"));
                break;
            case "BSCE":
                this.course = new Course(code, "Bachelor of Science in Civil Engineering",
                        new Department("College of Engineering"));
                break;
            default:
                this.course = new Course();
                break;
        }
    }

    public String details() {
        String name = (lName + ", " + fName + " " + mName + " " + suffix).trim();
        return  "===== STUDENT RECORD =====\n"
                + "ID: " + id + "\n"
                + "Name: " + name + "\n"
                + "Age: " + age + "\n"
                + "Year: " + year + "\n"
                + "Phone: " + phone + "\n"
                + "Email: " + email + "\n"
                + "Course: " + course.getName() + " (" + course.getCode() + ")\n"f
                + "Department: " + course.getDept().getName() + "\n";
    }

    private String safe(String s) {
        return s == null ? "" : s.trim();
    }
}
