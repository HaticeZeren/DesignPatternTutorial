package creational.design.patterns.builder;

public class Kitchen {
    private String appliances;
    private String flooring;

    public Kitchen(String appliances, String flooring) {
        this.appliances = appliances;
        this.flooring = flooring;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "appliances='" + appliances + '\'' +
                ", flooring='" + flooring + '\'' +
                '}';
    }
}
