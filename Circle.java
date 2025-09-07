import java.util.Scanner;

public class Circle {
        double radiusInMm;

        Circle(double radiusInMm) {
            this.radiusInMm = radiusInMm;
        }
        double getCircumference(){
            return 2 * radiusInMm * Math.PI;

        }
        double getArea(){
            return Math.PI * Math.pow(radiusInMm,2);
        }
        public String toString(){
            return "Circle Props: Radius in mm: " + radiusInMm
                    +",Circumference in mm: " + getCircumference()
                    + ", Area in mm2: "  + getArea();

        }
        public static void main (String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("welcome to the world of Circle\n ");
            System.out.println("please enter your radius: ");
                double radius = input.nextDouble();
                Circle circle = new Circle(radius);
               System.out.println(circle);


        }
    }

