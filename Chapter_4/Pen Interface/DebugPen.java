public class DebugPen {
    private String point;
    private String color;

    public DebugPen() {
        point = "medium";
        color = "black";
    }

    public DebugPen(String point, String color) {
        this.point = point;
        this.color = color;
    }

    public String getPoint() {
        return point;
    }

    public String getColor() {
        return color;
    }
}

/*
   DEBUGGED CHANGES:
   1. Added default constructor to provide initial values.
   2. Added parameterized constructor for user input.
   3. Added getter methods getPoint() and getColor().
*/
