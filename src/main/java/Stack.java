public class Stack {

    private int maxSize;
    private int[] stack;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stack = new int[this.maxSize];
        this.top = -1;
    }
}
