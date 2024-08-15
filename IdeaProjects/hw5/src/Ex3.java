 class IronSuit extends Vehicle {
    private String suitColor;  // Additional attribute for IronSuit

    // Constructor
    public IronSuit(String name, double width, double height, double length, double weight, int seatingCapacity, String registrationNumber, String suitColor) {
        super(name, width, height, length, weight, seatingCapacity, registrationNumber);
        this.suitColor = suitColor;
    }

    // Getter and Setter for suitColor
    public String getSuitColor() {
        return suitColor;
    }

    public void setSuitColor(String suitColor) {
        this.suitColor = suitColor;
    }

    // fly method that prints the points and distance
    public void fly(String pointA, String pointB, double distance) {
        System.out.println("Flying from " + pointA + " to " + pointB + ". Distance: " + distance + " km.");
    }

    // fly method with a progress bar simulation
    public void flyWithProgressBar(String pointA, String pointB, double distance) {
        System.out.print(pointA);
        int numberOfDots = (int) (distance / 10); // Adjust the number of dots based on distance
        for (int i = 0; i < numberOfDots; i++) {
            try {
                Thread.sleep(300);  // Pause for 0.3 seconds
            } catch (InterruptedException e) {
                // Ignore Exception handling
            }
            System.out.print(" .");
        }
        System.out.println(" " + pointB);
    }

    @Override
    public String toString() {
        return super.toString() + ", Suit Color: " + suitColor;
    }

    public static void main(String[] args) {
        IronSuit ironSuit = new IronSuit("Mark-42", 1.5, 2.0, 2.5, 250.0, 1, "IM1234", "Red-Gold");
        System.out.println(ironSuit);

        // Test flying from Hanoi to Da Nang
        ironSuit.fly("Hanoi", "Da Nang", 764.0);

        // Test flying with progress bar
        ironSuit.flyWithProgressBar("Hanoi", "Da Nang", 764.0);
    }
}
