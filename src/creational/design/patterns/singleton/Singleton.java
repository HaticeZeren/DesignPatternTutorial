package creational.design.patterns.singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        //nesnenin constructor üzerinden oluşumunu engellemek için private yaptık
    }

    /**
     * Thread-safe değildir
     *
     * @return
     */
    public static Singleton getInstance() {
        //Nesneyi getInstance() methodu ile oluşturuyoruz.
        //Nesne oluşturulmadan önce "var mı" kontrolü yapılıyor.
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * Thread-safe
     * synchronized her çağrıldığında maliyetli olacağından yavaştır
     *
     * @return
     */
    public synchronized static Singleton getInstance2() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * Thread-safe
     * Sadece ilk seferde senkronizasyon yapılır
     * performanslı ve güvenilir yöntemdir
     *
     * @return
     */
    public static Singleton getInstance3() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
