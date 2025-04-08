package creational.design.patterns.abstractfactory;

import creational.design.patterns.factory.Animal;

public class CatFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
