package creational.design.patterns.prototype;

import creational.design.patterns.factory.Animal;

public class Dog implements Animal,Cloneable {
    private String name;
    private String breed;
    private Owner owner;

    public Dog(String name, String breed, Owner owner) {
        this.name = name;
        this.breed = breed;
        this.owner = owner;
    }

    //Deep Copy örneğidir
    @Override
    protected Dog clone() throws CloneNotSupportedException {
        Dog dog = (Dog) super.clone();
        dog.setOwner(dog.getOwner().clone());
        return dog;
    }

    @Override
    public void speak() {
        System.out.println("Benim adım " + name + " ve sahibim: " + owner.getName());
    }

    public Owner getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Dog{name='" + name + "', breed='" + breed + "', owner=" + owner + "}";
    }
}
