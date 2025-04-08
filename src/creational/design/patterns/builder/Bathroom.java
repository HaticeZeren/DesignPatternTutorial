package creational.design.patterns.builder;

public class Bathroom {
    private String fixtures;
    private String flooring;

    public Bathroom(String fixtures, String flooring) {
        this.fixtures = fixtures;
        this.flooring = flooring;
    }

    @Override
    public String toString() {
        return "Bathroom{" +
                "fixtures='" + fixtures + '\'' +
                ", flooring='" + flooring + '\'' +
                '}';
    }
}
