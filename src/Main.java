import creational.design.patterns.builder.Bathroom;
import creational.design.patterns.builder.House;
import creational.design.patterns.builder.Kitchen;
import creational.design.patterns.factory.Animal;
import creational.design.patterns.factory.AnimalFactory;
import creational.design.patterns.abstractfactory.*;
import creational.design.patterns.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        //Singleton tasarım şablonu ile nesne yaratma örneğidir.
        Singleton instance = Singleton.getInstance3();

        //Factory kullanım örneğidir
        Animal dog = AnimalFactory.getAnimal("dog");
        dog.speak();
        Animal cat = AnimalFactory.getAnimal("cat");
        cat.speak();

        //Abstract Factory kullanım örneği
        creational.design.patterns.abstractfactory.AnimalFactory factory = null;

        factory = new DogFactory();
        Animal dogAnimal = factory.createAnimal();
        dogAnimal.speak();

        factory = new CatFactory();
        Animal catAnimal = factory.createAnimal();
        catAnimal.speak();

        //Builder Design Pattern
        //builder sayesinde birden fazla farklı nesneye bağlı olan bol parametreli bir nesneyi
        //yalın ve sade şekilde ihtiyacımız olan parametreleri doldurarak oluşturabildik
        House house = new House.Builder()
                .setCity("İstanbul")
                .setDistrict("Başakşehir")
                .setNeighborhood("5. Etap")
                .addBathroom(new Bathroom("Duşakabin","Fanyans"))
                .addKitchen(new Kitchen("Buzdolabı,Fırın","Parke"))
                .build();
        System.out.println(house.toString());
    }
}