import java.util.Objects;

public  class Dog extends Animals{
    public String color;
    public void setColor(String color) {
        this.color = "Grey";
    }
    public String getColor() {
        return color;
    }

    public Dog(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }

    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    public String makeNoise() {
        return "Sometimes can bark";
    }

    @Override
    public String eat() {
        return "Everything";
    }



    @Override
    public String toString() {
        return "dog color: " +color +" | dogs food:" +getFood() + " | dogs location:"+getLacation() ;
    }


}
