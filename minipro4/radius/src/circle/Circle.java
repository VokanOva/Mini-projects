package circle;

import java.util.Objects;

public class Circle {
    private double radius;
    private String color;

    public Circle(){

    }
    public Circle (double radius){
        this.radius=radius;

    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getArea(){
        return Math.PI * Math.pow (this.radius, 2) ;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 && Objects.equals(color, circle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, color);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
