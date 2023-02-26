import java.util.Objects;

public class Cat extends Animals {
    private String name;

    public Cat(String food, String location, String name) {
        super(food, location);
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    public String toString() {
        return "Cats name:" +name +" | Cats food:"+getFood() +" | Cats location:"+getLacation();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String makeNoise() {
        return "Extends from nature your cat have";
    }

    @Override
    public String eat() {
        return "There are many types of food,your Cat can eat";
    }


}
