//Zoo project practice
//AB CIT-63
//3/8/26

public class Tiger extends Animals {
    // Unique feature
    private String roarNoise;

    // Constructor
    public Tiger(int age, String color, String gender, int weight, String origin) {
        super(age, "Tiger", color, gender, weight, origin);
        this.roarNoise = "Mew"; // Default based on your text file
    }

    // Boilerplate Getters and Setters
    public String getRoarNoise() {
        return roarNoise;
    }

    public void setRoarNoise(String roarNoise) {
        this.roarNoise = roarNoise;
    }

    // Polymorphism: Overriding the superclass method
    @Override
    public void makeSound() {
        System.out.println("The tiger roars: " + this.roarNoise);
    }
}