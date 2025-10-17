public class Course {
    private String code, name;
    private Department dept;

    public Course() {
        this.code = "NONE";
        this.name = "No Course";
        this.dept = new Department("No Department");
    }

    public Course(String code, String name, Department dept) {
        this.code = code;
        this.name = name;
        this.dept = dept;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Department getDept() {
        return dept;
    }
}
.