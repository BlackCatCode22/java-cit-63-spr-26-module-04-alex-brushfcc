//Zoo project practice
//AB CIT-63
//3/8/26

public class Hyena extends Animals {
// unique feature just for Hyenas
    private String laughStyle;
// Constructor for the Hyena
    public Hyena(int age, String color, String gender, int weight, String origin) {
        // the 'super' keyword calls the constructor of the Animal superclass
        super(age, "Hyena", color, gender, weight, origin);
        this.laughStyle = "haha"; //Default or parsed value
    }

    //Getter and Setter for the unique feature
    public String getLaughStyle() {
        return laughStyle;
    }
    public void setLaughStyle(String laughStyle) {
        this.laughStyle = laughStyle;
    }

    //Overriding the Superclass method (Polymorphism)


    @Override
    public void makeSound() {
        System.out.println("The hyena laughs: " + this.laughStyle);
    }
}
