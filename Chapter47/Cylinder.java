public class Cylinder {
    private double radius = 0;  
    private double height = 0;  
  
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
  
    public double volume() {
        return Math.PI * (radius * radius) * height; 
    }

    public double surfacearea() {
        return (2 * Math.PI * (radius * radius)) + (2 * Math.PI * radius * height);
    }

}