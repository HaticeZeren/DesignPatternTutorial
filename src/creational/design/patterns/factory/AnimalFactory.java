package creational.design.patterns.factory;

public class AnimalFactory {
    //Factory design pattern'da görüldüğü üzere animalType üzerinden bir switch-case var.
    //Her yeni animalType için bir case eklemek gerekli
    //SOLID prensiblerinden Open-Closed ilkesine uygun bir kod yazım şekli değildir
    public static Animal getAnimal(String animalType) {
        return switch (animalType) {
            case "cat" -> new Cat();
            case "dog" -> new Dog();
            default -> throw new IllegalArgumentException("Unknown type: " + animalType);
        };
    }
}
