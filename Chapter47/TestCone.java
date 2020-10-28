import java.util.Scanner ;

public class TestCone
{
  public static void main( String[] args ) 
  {
    Scanner scan = new Scanner(System.in);

    double radius, height;

    System.out.print("Enter radius: " ); 
    radius = scan.nextDouble();

    System.out.print("Enter height: " ); 
    height = scan.nextDouble();
 
    Cone cone = new Cone(3.2, 4.1);

    System.out.println( "Area "  + cone.area() + " Volume: " + cone.volume() + " Slant: " + cone.slant() + " Angle: " + cone.angle());
  }
}