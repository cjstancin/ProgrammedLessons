public class BoxTester {
    public static void main(String[] args){
        Box box1 = new Box(1, 2, 3);
        Box box2 = new Box(box1);
        Box biggerBox = Box.biggerBox(box2);
        Box smallerBox = Box.smallerBox(box2);
        System.out.println("Does the box fit into the big box? " + box1.nests(biggerBox));
        System.out.println("Does the box fit into the small box? " + box1.nests(smallerBox));
    }
}