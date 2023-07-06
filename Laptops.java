

public class Laptops {
    private String brand;
    private int HHD;
    private int RAM;
    private int displaySize;
    private String OS;
    private String color;
    private int USB_count;
    private int price;

    public Laptops(String brand, int HHD, int RAM, int displaySize, String OS, String color, int USB_count, int price) {
        this.brand = brand;
        this.HHD = HHD;
        this.RAM = RAM;
        this.displaySize = displaySize;
        this.OS = OS;
        this.color = color;
        this.USB_count = USB_count;
        this.price = price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + HHD;
        result = prime * result + RAM;
        result = prime * result + displaySize;
        result = prime * result + ((OS == null) ? 0 : OS.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + USB_count;
        result = prime * result + price;

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptops other = (Laptops) obj;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        if (HHD != other.HHD)
            return false;
        if (RAM != other.RAM)
            return false;
        if (displaySize != other.displaySize)
            return false;
        if (OS == null) {
            if (other.OS != null)
                return false;
        } else if (!OS.equals(other.OS))
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (USB_count != other.USB_count)
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHHD() {
        return HHD;
    }

    public void setHHD(int HHD) {
        this.HHD = HHD;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getDisplay() {
        return displaySize;
    }

    public void setDisplay(int displaySize) {
        this.displaySize = displaySize;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getUSB() {
        return USB_count;
    }

    public void setUSB(int USB_count) {
        this.USB_count = USB_count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{brand: " + brand + ", HHD: " + HHD + ", RAM: " + RAM + ", displaySize: " + displaySize +
                ", OS: " + OS + ", color: " + color + ", USB_count: " + USB_count + ", price: " + price + "}";
    }

}