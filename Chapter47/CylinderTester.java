import java.util.Scanner ;

public class CylinderTester {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    double radius, height;

    System.out.print("Enter radius: " ); 
    radius = scan.nextDouble();

    System.out.print("Enter height: " ); 
    height = scan.nextDouble();
 
    Cylinder cylinder = new Cylinder(3.2, 4.1);

    System.out.println( "Volume: "  + cylinder.volume() + " Surface Area: " + cylinder.surfacearea());
  }
}