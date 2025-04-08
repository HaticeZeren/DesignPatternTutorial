package creational.design.patterns.abstractfactory;

public class DogFactory implements IAbstractFactory {
    @Override
    public IAnimal createAnimal() {
        return new Dog();
    }
}
