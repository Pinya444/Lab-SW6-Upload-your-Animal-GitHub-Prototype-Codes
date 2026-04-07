public class Horse implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String color;

    public Horse() {
        this.legs = 4;
        this.sound = "Neigh";
        this.food = "Hay";
        this.color = "Brown";
    }

    @Override
    public Animal clone() {
        return new Horse();
    }

    @Override
    public void makeSound() {
        System.out.println("Horse says " + sound);
    }

    @Override
    public String getType() {
        return "Horse";
    }
        public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}