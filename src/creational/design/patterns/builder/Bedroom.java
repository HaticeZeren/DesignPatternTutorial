package creational.design.patterns.builder;

public class Bedroom {
    private String bed;
    private String flooring;

    public Bedroom(String bed, String flooring) {
        this.bed = bed;
        this.flooring = flooring;
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "bed='" + bed + '\'' +
                ", flooring='" + flooring + '\'' +
                '}';
    }
}
