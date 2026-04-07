import java.util.HashMap;
import java.util.Map;

public class AnimalRegistry {
    private Map<String, Animal> prototypes = new HashMap<>();

    public AnimalRegistry() {
        prototypes.put("sheep", new Sheep("Default Sheep"));
        prototypes.put("cow", new Cow());
        prototypes.put("horse", new Horse());
    }

    public Animal createSheep(String name) {
        Sheep sheep = (Sheep) prototypes.get("sheep").clone();
        return new Sheep(name); // customize name
    }

    public Animal createCow() {
        return prototypes.get("cow").clone();
    }

    public Animal createHorse() {
        return prototypes.get("horse").clone();
    }
}