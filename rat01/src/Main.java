//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create a Rat object named Remy, 2 years old, weighing 0.5kg
        Rat rat = new Rat("Remy", 2, 0.5, Pattern.BLACK);

        // Display initial rat information
        System.out.println("Initial Rat Information:");
        System.out.println("Name: " + rat.getName());
        System.out.println("Age: " + rat.getAge() + " years");
        System.out.println("Weight: " + rat.getWeight() + " kg");
        System.out.println();

        // Perform actions
        rat.eat(0.2);   // Remy eats 0.2kg of food
        rat.sleep(5);   // Remy sleeps for 5 hours
        rat.move(10);   // Remy moves 10 meters

        // Display updated rat information
        System.out.println("\nUpdated Rat Information:");
        System.out.println("Name: " + rat.getName());
        System.out.println("Age: " + rat.getAge() + " years");
        System.out.println("Weight: " + rat.getWeight() + " kg");
    }
}