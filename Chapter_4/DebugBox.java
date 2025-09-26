public class DebugBox {
    private int width;
    private int length;
    private int height;

    public DebugBox() {
        width = 1;
        length = 1;
        height = 1;
    }

    public DebugBox(int width, int length, int height) {
        this.width = width;   
        this.length = length; 
        this.height = height; 
    }

    public void showData() {
        System.out.println("Width: " + width + " Length: " + length + " Height: " + height);
    }

    public double getVolume() {
        return length * width * height;
    }
}

/*
   DEBUGGED CODE
Original mistake was in the constructor:

public DebugBox(int width, int length, int height)
{
    this.width = width;
    this.length = width;   //  wrong
    this.height = width;   //  wrong
}

Both length and height were incorrectly set to width.
Fix: assign each parameter to its correct variable.
*/
