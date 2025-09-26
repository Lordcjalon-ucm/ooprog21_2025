// Debugged version of Pen class
public class DebugPen {
    private String color;
    private String point;

    public DebugPen() {
        color = "black";
        point = "fine";
    }

    public DebugPen(String color, String point) {
        this.color = color;   // ✅ use 'this' to assign to class field
        this.point = point;   // ✅ fixed
    }

    public String getColor() {
        return color;
    }

    public String getPoint() {
        return point;
    }

        public void showData() {
        System.out.println("Pen Color: " + color + " | Point: " + point);
    }
}

/*
   DEBUGGED CODE
Original mistake was in the constructor:

public DebugPen(String color, String point)
{
    color = color;   // wrong, assigns parameter to itself
    point = point;   // wrong, assigns parameter to itself
}

Fix: use 'this' to refer to the class fields:
this.color = color;
this.point = point;
*/
