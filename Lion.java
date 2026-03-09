//Zoo project practice
//AB CIT-63
//3/8/26

public class Lion extends Animals {
    // unique feature
    private String roarNoise;

    // Constructor
    public Lion(int age, String color, String gender, int weight, String origin) {
        super(age, "Lion", color, gender, weight, origin);
        this.roarNoise = "Roarrr";
    }
    //Boilerplate Getters and Setters
    public String getRoarNoise() {
        return roarNoise;
    }
    public void setRoarNoise(String roarNoise) {
        this.roarNoise = roarNoise;
    }
    @Override
    public void makeSound() {
        System.out.println("The lion roars: " + this.roarNoise);
    }
}
