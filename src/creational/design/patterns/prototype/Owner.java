package creational.design.patterns.prototype;

public class Owner implements Cloneable {
    private String name;

    public Owner(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    //Owner sınıfı içinde başka bir nesne olmadığından shallow copy yapıyoruz
    @Override
    protected Owner clone() throws CloneNotSupportedException {
        return (Owner) super.clone();
    }

    @Override
    public String toString() {
        return "Owner{name='" + name + "'}";
    }
}
