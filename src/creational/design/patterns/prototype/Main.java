package creational.design.patterns.prototype;


public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        long startTime = System.nanoTime();

        //Prototype Design Pattern
        Owner originalOwner = new Owner("Hatice");
        Dog originalDog = new Dog("Börü", "Golden", originalOwner);

        Dog clonedDog = originalDog.clone();
        // Şimdi owner'ı değiştirelim
        clonedDog.getOwner().setName("Elif");

        originalDog.speak(); //owner değişmemeli
        clonedDog.speak();//owner değişmeli

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Kopyalama işlemi " + duration + " nanosanide sürdü.");
    }
}