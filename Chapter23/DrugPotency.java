public class DrugPotency {
    public static void main(String[] args){
        double percent = 100.0;
        int month = 0;
        System.out.println("month: " + month + "    effectiveness: " + percent);

        while (percent >= 50.0) {
            percent = percent * 0.96;
            month = month + 1;
            System.out.println("month: " + month + "    effectiveness: " + percent);
        }
        System.out.print("end");
    }
}