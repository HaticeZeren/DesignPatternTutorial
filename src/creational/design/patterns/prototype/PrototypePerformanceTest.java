package creational.design.patterns.prototype;

public class PrototypePerformanceTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Owner originalOwner = new Owner("Hatice");
        Dog originalDog = new Dog("Hektor", "Golden", originalOwner);

        int cloneCount = 1000;
        Dog[] clonedDogs = new Dog[cloneCount];

        System.out.println(">>> Klonlama testi başlıyor...");

        long startTime = System.nanoTime();

        for (int i = 0; i < cloneCount; i++) {
            clonedDogs[i] = originalDog.clone();
        }

        long endTime = System.nanoTime();
        long durationNano = endTime - startTime;
        double durationMillis = durationNano / 1_000_000.0;

        System.out.printf(">>> %d köpek başarıyla klonlandı.%n", cloneCount);
        System.out.printf(">>> Toplam süre: %.3f milisaniye.%n", durationMillis);
        System.out.printf(">>> Ortalama süre: %.3f milisaniye.%n", durationMillis / cloneCount);
    }
}