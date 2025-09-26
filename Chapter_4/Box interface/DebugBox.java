public class DebugBox {
    private int width, length, height;

    public DebugBox() {
        width = length = height = 1;
    }

    public DebugBox(int w, int l, int h) {
        width = w;
        length = l;
        height = h;
    }

    public void showData() {
        System.out.println("Width: " + width + " Length: " + length + " Height: " + height);
    }

    public int getVolume() {
        return width * length * height;
    }
}
