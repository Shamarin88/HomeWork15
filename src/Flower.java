public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    private int lifeSpan;
    public Flower(String flowerColor, String country, double cost, int lifeSpan) {
        this.flowerColor = flowerColor;
        this.country = country;
        this.cost = cost;
        this.lifeSpan = lifeSpan;
    }
    public String getFlowerColor() {
        return flowerColor;
    }
    public void setFlowerColor(String flowerColor) {
        if (flowerColor.isBlank() || flowerColor.isEmpty() || flowerColor == null) {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        if (country.isBlank() || country.isEmpty() || country == null) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }
    @Override
    public String toString() {
        return "Цвет: " + getFlowerColor() + "\nСтрана производитель: " + getCountry() + "\nЦена за штуку: " + getCost() + "\nСрок стояния: " + lifeSpan;
    }
}
