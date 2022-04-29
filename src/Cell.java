import java.awt.*;

public class Cell {
    private int x, y;
    private int size;
    private Color color;

    public Cell(int x, int y, int size, Color color){
        set(x, y);
        this.size = size;
        this.color = color;
    }

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {                       // get the X coordinate
        return x;
    }

    public int getY() {                       // get the Y coordinate
        return y;
    }

    public void paint(Graphics2D g) {           // object rendering
        g.setColor(color);
        g.fillOval(x * size, y * size,        // upper left corner
                size, size);                  // width and height
    }
}
