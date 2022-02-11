package peaksoft.spring_home_work;

public class Horse implements Animal{
    private String name;
    private int age;

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

    @Override
    public void animalPlus() {
        System.out.println("The high animal is 2 meter");
    }

    @Override
    public void animalMinus() {
        System.out.println("A strong horse");
    }

    @Override
    public String toString() {
        return " Horse " +
                " name='" + name +
                " age " + age ;
    }
}
