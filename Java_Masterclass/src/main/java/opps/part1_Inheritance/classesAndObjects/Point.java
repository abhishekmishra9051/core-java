package opps.part1_Inheritance.classesAndObjects;

public class Point {
    // write code here
    private int x;
    private int y;

    public Point(){}
    public Point(int x, int y){ this.x = x; this.y = y;}

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    public double distance(Point anotherPoint) {
        int xDiff = this.x - anotherPoint.getX();
        int yDiff = this.y - anotherPoint.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}
