public  abstract class Animals {
    private String food;
    private String location;

    public Animals(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLacation() {
        return location;
    }

    public void setLacation(String location) {
        this.location = location;
    }
    public abstract String  makeNoise();

    public abstract String eat();

    public  String  sleep(){
     return "The animal is sleeping";}

}
