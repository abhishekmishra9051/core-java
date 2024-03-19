package opps.part1_Inheritance.classesAndObjects;

public class Wall {
    private double width;
    private double height;

    // Constructors
    public Wall() {
        this.width = 0;
        this.height = 0;
    }

    public Wall(double width, double height) {
        if (width < 0)
            this.width = 0;
        else
            this.width = width;

        if (height < 0)
            this.height = 0;
        else
            this.height = height;
    }

    // Getter methods
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Setter methods
    public void setWidth(double width) {
        if (width < 0)
            this.width = 0;
        else
            this.width = width;
    }

    public void setHeight(double height) {
        if (height < 0)
            this.height = 0;
        else
            this.height = height;
    }

    // Method to calculate area
    public double getArea() {
        return width * height;
    }
}
