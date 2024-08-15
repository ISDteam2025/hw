 class Vehicle {
    private String name;
    private double width;
    private double height;
    private double length;
    private double weight;
    private int seatingCapacity;
    private String registrationNumber;

    // Constructor
    public Vehicle(String name, double width, double height, double length, double weight, int seatingCapacity, String registrationNumber) {
        this.name = name;
        this.width = width;
        this.height = height;
        setLength(length);
        setWeight(weight);
        this.seatingCapacity = seatingCapacity;
        setRegistrationNumber(registrationNumber);
    }

    // Getter and Setter methods
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight >= 0) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Weight must be non-negative.");
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length >= 0) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("Length must be non-negative.");
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber.length() <= 12) {
            this.registrationNumber = registrationNumber;
        } else {
            throw new IllegalArgumentException("Registration number must be up to 12 characters long.");
        }
    }

    @Override
    public String toString() {
        return "Vehicle Type: " + this.getClass().getSimpleName() + ", Name: " + name + ", Width: " + width + ", Height: " + height + ", Length: " + length + ", Weight: " + weight + ", Seating Capacity: " + seatingCapacity + ", Registration Number: " + registrationNumber;
    }
}

class Bus extends Vehicle {
    private int[] routes;

    // Constructor
    public Bus(String name, double width, double height, double length, double weight, int seatingCapacity, String registrationNumber, int[] routes) {
        super(name, width, height, length, weight, seatingCapacity, registrationNumber);
        setLength(length);
        setWeight(weight);
        setRegistrationNumber(registrationNumber);
        this.routes = routes;
    }

    @Override
    public void setWeight(double weight) {
        if (weight >= 5000.0 && weight <= 20000.0) {
            super.setWeight(weight);
        } else {
            throw new IllegalArgumentException("Bus weight must be between 5000.0 and 20000.0 kg.");
        }
    }

    @Override
    public void setLength(double length) {
        if (length >= 4.0 && length <= 10.0) {
            super.setLength(length);
        } else {
            throw new IllegalArgumentException("Bus length must be between 4.0 and 10.0 meters.");
        }
    }

    @Override
    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber.length() <= 8) {
            super.setRegistrationNumber(registrationNumber);
        } else {
            throw new IllegalArgumentException("Bus registration number must be up to 8 characters long.");
        }
    }
}

class Car extends Vehicle {
    private String owner;

    // Constructor
    public Car(String name, double width, double height, double length, double weight, int seatingCapacity, String registrationNumber, String owner) {
        super(name, width, height, length, weight, seatingCapacity, registrationNumber);
        setLength(length);
        setWeight(weight);
        setRegistrationNumber(registrationNumber);
        this.owner = owner;
    }

    @Override
    public void setWeight(double weight) {
        if (weight >= 1000.0 && weight <= 2000.0) {
            super.setWeight(weight);
        } else {
            throw new IllegalArgumentException("Car weight must be between 1000.0 and 2000.0 kg.");
        }
    }

    @Override
    public void setLength(double length) {
        if (length >= 1.5 && length <= 3.5) {
            super.setLength(length);
        } else {
            throw new IllegalArgumentException("Car length must be between 1.5 and 3.5 meters.");
        }
    }

    @Override
    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber.length() <= 6) {
            super.setRegistrationNumber(registrationNumber);
        } else {
            throw new IllegalArgumentException("Car registration number must be up to 6 characters long.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Test Vehicle
        Vehicle vehicle = new Vehicle("GenericVehicle", 2.0, 1.5, 5.0, 1500.0, 4, "GEN123456789");
        System.out.println(vehicle);

        // Test Bus
        Bus bus = new Bus("CityBus", 2.5, 3.0, 7.0, 12000.0, 50, "BUS12345", new int[]{101, 102});
        System.out.println(bus);

        // Test Car
        Car car = new Car("Sedan", 1.8, 1.4, 3.0, 1500.0, 5, "CAR123", "John Doe");
        System.out.println(car);
    }
}
