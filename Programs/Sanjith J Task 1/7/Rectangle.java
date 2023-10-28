public class Rectangle{
    double area(double l, double b){
        return l*b;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        double area1= r1.area(4,5);

        Rectangle r2 = new Rectangle();
        double area2= r1.area(5,8);

        System.out.println("Area of first rectangle= "+area1);
        System.out.println("Area of second rectangle= "+area2);

    }

}
