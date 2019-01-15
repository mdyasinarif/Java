package abstractEx;

abstract class Figure {
     double dim1;
     double dim2;
     int x = 4;

    public Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract double area();// abstract method in abstract class

    void sum() {            // non abstract method in abstract class
    }
}

class Rectangle extends Figure {

    Rectangle(double a, double b) {
        super(a, b);                // figer class ar variable nawar jonno 
        
    }

    @Override
    double area() {
        System.out.println("Inside Area for Rectangle");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {

    public Triangle(double a, double b) {
        super(a, b);    // figer class ar variable nawar jonno 

    }

    @Override
    double area() {
        System.out.println("Inside Area for Triangle");
        return dim1 * dim2 / 2;
    }

}

class AbstractAreas {

    public static void main(String[] args) {
        //  Figure f = new Figure(10, 10);  abstract method so can't create object
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figgerf;//this is ok no object is created
        figgerf = r; // super class ar sub class 
        System.out.println("Area is " + figgerf.area());
        figgerf = t; // super class ar sub class 
        System.out.println("Area is " + figgerf.area());
    }
}
