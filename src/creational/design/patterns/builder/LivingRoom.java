package creational.design.patterns.builder;

public class LivingRoom {
    private String furniture;
    private String flooring;

    public LivingRoom(String furniture, String flooring) {
        this.furniture = furniture;
        this.flooring = flooring;
    }

    @Override
    public String toString() {
        return "LivingRoom{" +
                "furniture='" + furniture + '\'' +
                ", flooring='" + flooring + '\'' +
                '}';
    }
}
