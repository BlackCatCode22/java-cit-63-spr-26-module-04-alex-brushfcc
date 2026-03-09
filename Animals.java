//Zoo project practice
//AB CIT-63
//3/8/26

public class Animals {
    //1. Encapsulate Properties( private fields
    private String id;
    private String name;
    private int age;
    private String species;
    private String birthDate;
    private String color;
    private String gender;
    private int weight;
    private String origin;
    private String arrivalDate;

    //2. Contructor
    public Animals(int age, String species, String color, String gender, int weight, String origin){
        this.age = age;
        this.species = species;
        this.color = color;
        this.gender = gender;
        this.weight = weight;
        this.origin = origin;

        //These can be set later via setters once parsed or calculated
        this.id = "TBD";
        this.name = "TBD";
        this.birthDate = "TBD";
    }
    // 3.Getters and Setters (controlled access)
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
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    //4. Polymorphism Hook
    //A generic method that subclasses can override.
    public void makeSound() {
        System.out.println("Generic animal sound...");
    }


}
