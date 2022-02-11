package peaksoft.spring_home_work;

public class Person {
    private String name;
    private int age;
    private Animal animal;


    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

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
        System.out.println("Animal is ok");
    }


    @Override
    public String toString() {
        return "Person{" +
                ", name='" + name + '\'' +
                ", age=" + age + "\n" +
                " Animal{" + animal +
                '}';
    }

    public void setAnimal1(Horse animal1) {
    }
}
