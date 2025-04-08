package creational.design.patterns.abstractfactory;

import creational.design.patterns.factory.Animal;

public class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("Hav Hav Hav Hav");
    }
}
