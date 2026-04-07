public class Cow implements Animal {
    private int legs;
    private String sound;
    private String food;

    public Cow() {
        this.legs = 4;
        this.sound = "Moo!";
        this.food = "Grass";
    }

    @Override
    public Animal clone() {
        return new Cow();
    }

    @Override
    public void makeSound() {
        System.out.println("Cow says " + sound);
    }

    @Override
    public String getType() {
        return "Cow";
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}