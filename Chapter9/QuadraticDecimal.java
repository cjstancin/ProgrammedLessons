public class QuadraticDecimal {
    public static void main(String[] args){
        double x = 4;
        var ans = 3*(x*x)-(8*x)+4;
        System.out.println("At x = 4.0 the answer is " + ans);
        x = x-2;
        ans = 3*(x*x)-(8*x)+4;
        System.out.println("At x = 2.0 the answer is " + ans);
        x = x-2;
        ans = 3*(x*x)-(8*x)+4;
        System.out.println("At x = 0.0 the answer is " + ans);
    }
}