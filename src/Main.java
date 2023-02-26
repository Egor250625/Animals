public class Main {
    public static void main(String[] args) {
        Veterenar veterenar = new Veterenar();
        Animals[] animals = new Animals[3];
        animals[0] = new Cat("Meat and Milk","At home or on the street ","Barsik");
        animals[1] = new Dog("Bone","At home or in the street","Grey");
        animals[2] = new Horse("Grass,carrot,vegetables","On the farm,stable","From 1.4 meters to 1.7 meters int height");

        for (Animals animal : animals){
            veterenar.threadAnimal(animal);
        }


    }
}