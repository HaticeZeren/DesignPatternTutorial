package creational.design.patterns.builder;

public class House {
    private String city;   // Şehir
    private String district; // İlçe
    private String neighborhood;// Mahalle
    private Kitchen kitchen;     // Mutfak
    private Bathroom bathroom;   // Banyo
    private LivingRoom livingRoom; // Oturma Odası
    private Bedroom bedroom;     // Yatak Odası

    //Builder sınıfı
    public static class Builder {
        private String city;
        private String district;
        private String neighborhood;
        private Kitchen kitchen;
        private Bathroom bathroom;
        private LivingRoom livingRoom;
        private Bedroom bedroom;

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setDistrict(String district) {
            this.district = district;
            return this;
        }

        public Builder setNeighborhood(String neighborhood) {
            this.neighborhood = neighborhood;
            return this;
        }

        public Builder addKitchen(Kitchen kitchen) {
            this.kitchen = kitchen;
            return this;
        }

        public Builder addBathroom(Bathroom bathroom) {
            this.bathroom = bathroom;
            return this;
        }

        public Builder addLivingRoom(LivingRoom livingRoom) {
            this.livingRoom = livingRoom;
            return this;
        }

        public Builder addBedroom(Bedroom bedroom) {
            this.bedroom = bedroom;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

    private House(Builder builder) {
        this.city = builder.city;
        this.district = builder.district;
        this.neighborhood = builder.neighborhood;
        this.kitchen = builder.kitchen;
        this.bathroom = builder.bathroom;
        this.livingRoom = builder.livingRoom;
        this.bedroom = builder.bedroom;
    }

    @Override
    public String toString() {
        return "House{" +
                "city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", neighborhood='" + neighborhood + '\'' +
                ", kitchen=" + kitchen +
                ", bathroom=" + bathroom +
                ", livingRoom=" + livingRoom +
                ", bedroom=" + bedroom +
                '}';
    }
}
