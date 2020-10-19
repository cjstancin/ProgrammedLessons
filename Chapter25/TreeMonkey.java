public class TreeMonkey {
    public static void main(String[] args) {
    String num = "";
        for (int i = 5; i >= 0; i--) {
            if (i == 5){
                num = "Five little monkeys";
            } else if (i == 4) {
                num = "Four little monkeys";
            } else if(i == 3) {
                num = "Three little monkeys";
            } else if(i == 2) {
                num = "Two little monkeys";
            } else if(i == 1) {
                num = "One little monkey";
            } else {
                num = "No little monkeys";
            }
            System.out.println(num + " swinging in a tree teasing Mr. Crocodile You can't catch me along came the corocodile as quiet as can be and SNAP! monke ded");
        }
    }
}