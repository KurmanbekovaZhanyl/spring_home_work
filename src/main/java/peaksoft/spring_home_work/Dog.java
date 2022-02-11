package peaksoft.spring_home_work;

public class Dog implements Animal{

    private String name;
    private int age;
    private String breed;
    private String colour;

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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void animalPlus() {
        System.out.println("A little dog");
    }

    @Override
    public void animalMinus() {
        System.out.println("Like likes to walk");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
