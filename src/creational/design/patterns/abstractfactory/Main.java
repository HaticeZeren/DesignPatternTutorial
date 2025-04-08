package creational.design.patterns.abstractfactory;

public class Main {
    public static void main(String[] args) {

        //Abstract Factory kullanım örneği

        IAbstractFactory dogFactory = new DogFactory();
        IAbstractFactory catFactory = new CatFactory();

        IAnimal dogIAnimal = dogFactory.createAnimal();
        dogIAnimal.speak(); //Hav Hav

        IAnimal catIAnimal = catFactory.createAnimal();
        catIAnimal.speak(); // Miyav Miyav
    }
}