import java.util.ArrayList;
import java.util.Collections;

public class MaxMinIntList extends ArrayList<Integer> {
    
    // Method to get the minimum value from the list
    public Integer min() {
        if (this.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return Collections.min(this);
    }

    // Method to get the maximum value from the list
    public Integer max() {
        if (this.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return Collections.max(this);
    }

    public static void main(String[] args) {
        MaxMinIntList list = new MaxMinIntList();
        list.add(5);
        list.add(1);
        list.add(9);
        list.add(3);
        
        System.out.println("List: " + list);
        System.out.println("Minimum: " + list.min());
        System.out.println("Maximum: " + list.max());
    }
}
