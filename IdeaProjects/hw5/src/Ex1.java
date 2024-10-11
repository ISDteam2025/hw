public class Counter {
    private int count;

    // Constructor that initializes count to 0
    public Counter() {
        this.count = 0;
    }

    // Method to get the current value of count
    public int get() {
        return count;
    }

    // Method to increment the count by 1
    public void incr() {
        count++;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        for (int i = 1; i <= 100; i++) {
            counter.incr();
        }
        System.out.println("Number of iterations: " + counter.get());
    }
}
