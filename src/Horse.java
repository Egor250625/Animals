import java.util.Objects;

public class Horse extends Animals {

    public String size;

    public Horse(String food, String location, String size) {
        super(food, location);
        this.size = size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Horse height:"+size +" | Horse food:"+ getFood()+" | Horse location:"+getLacation();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(size, horse.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }

    public Horse(String food, String location) {
        super(food, location);
    }

    @Override
    public String makeNoise() {
        return "Very noisy";
    }

    @Override
    public String eat() {
        return "Horses are naturally grazers, they eat little and often";
    }


}
