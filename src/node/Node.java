package node;

public class Node {
    private int index;
    private int distance;

    public Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public void show() {
        System.out.println("("+ this.index + "," + this.distance+ ") ");
    }
}
