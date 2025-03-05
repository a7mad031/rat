public class Rat {
    // Properties (fields)
    private String name;
    private int age;
    private double weight;

    // Constructor
    public Rat(String name, int age, double weight, Pattern pattern) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Method to simulate eating
    public void eat(double foodAmount) {
        if (foodAmount > 0) {
            weight += foodAmount * 0.1; // Assume 10% of food amount contributes to weight gain
            System.out.println(name + " is eating. Food amount: " + foodAmount + "kg.");
            System.out.println(name + "'s new weight: " + weight + "kg.");
        } else {
            System.out.println("Invalid food amount.");
        }
    }

    // Method to simulate sleeping
    public void sleep(int hours) {
        if (hours > 0) {
            System.out.println(name + " is sleeping for " + hours + " hours.");
        } else {
            System.out.println("Invalid sleep duration.");
        }
    }

    // Method to simulate moving
    public void move(double distance) {
        if (distance > 0) {
            System.out.println(name + " moved " + distance + " meters.");
        } else {
            System.out.println("Invalid distance.");
        }
    }

    // Main method to test the Rat class
    public static void main(String[] args) {
        Rat rat = new Rat("Remy", 2, 0.5); // Create a Rat object named Remy, 2 years old, weighing 0.5kg
        rat.eat(0.2); // Remy eats 0.2kg of food
        rat.sleep(5); // Remy sleeps for 5 hours
        rat.move(10); // Remy moves 10 meters
    }
}
