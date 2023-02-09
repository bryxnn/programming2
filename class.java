public class TwoDShape{

    private String color;

    private double area;

    private double perimeter;

    public TwoDShape(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public TwoDShape(double area){
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public TwoDShape (double perimeter) {
        this.perimeter = perimeter;
    }
    
    public double getPerimeter() {
        return perimeter;
    }

}

public class Circle extends TwoDShape {}

public class Rectangle extends TwoDShape {}

public class Square extends TwoDShape {}