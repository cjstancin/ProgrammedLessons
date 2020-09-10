public class Trigonometry {
    public static void main(String[] args) {
        double sinx = Math.sin(0.823);
        double cosx = Math.cos(0.823);
        double sin2 = sinx * sinx;
        double cos2 = cosx * cosx;
        double sum = sin2 + cos2;
        System.out.println("Sine: " + sinx + " Cosine: " + cosx + " Sum of Squares: " + sum);
    }
}