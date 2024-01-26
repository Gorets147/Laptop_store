import java.util.Objects;

public class Laptop {

    private String name, color, bodyMaterial;

    private String screenDiagonal, price;

    private int ram, ssd, hdd;

    private String operatingSystem;

    public Laptop(String name,
                  String color,
                  String bodyMaterial,
                  String screenDiagonal, String price,
                  int ram, int ssd, int hdd,
                  String operatingSystem) {
        this.name = name;
        this.color = color;
        this.bodyMaterial = bodyMaterial;
        this.screenDiagonal = screenDiagonal;
        this.price = price;
        this.ram = ram;
        this.ssd = ssd;
        this.hdd = hdd;
        this.operatingSystem = operatingSystem;
    }

    public Laptop(String name, int ram, int ssd, String operatingSystem, String color) {
        this.name = name;
        this.ram = ram;
        this.ssd = ssd;
        this.operatingSystem = operatingSystem;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getBodyMaterial() {
        return bodyMaterial;
    }

    public String getScreenDiagonal() {
        return screenDiagonal;
    }

    public String getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    public int getSsd() {
        return ssd;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBodyMaterial(String bodyMaterial) {
        this.bodyMaterial = bodyMaterial;
    }

    public void setScreenDiagonal(String screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + name + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", os='" + operatingSystem + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, bodyMaterial, screenDiagonal, price, ram, ssd, hdd, operatingSystem);
    }
}

