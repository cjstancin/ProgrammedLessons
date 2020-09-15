public class Substrings {
    public static void main(String[] args) {
        String str = new String( "Golf is an good walk spoiled." );
        String sub = str.substring(0); 
        String sub2 = str.substring(str.length()-1); 
        System.out.println(sub);
        System.out.println(sub2);
    }
}