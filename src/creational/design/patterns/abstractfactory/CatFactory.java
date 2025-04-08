package creational.design.patterns.abstractfactory;

public class CatFactory implements IAbstractFactory {
    @Override
    public IAnimal createAnimal() {
        return new Cat();
    }
}
