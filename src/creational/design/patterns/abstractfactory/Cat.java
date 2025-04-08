package creational.design.patterns.abstractfactory;

import creational.design.patterns.factory.Animal;

public class Cat implements Animal {
    @Override
    public void speak() {
        System.out.println("Miyav Miyav Miyav Miyav");
    }
}
