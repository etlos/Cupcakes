package FunctionLayer;

public class Topping {

    public int toppingId;
    public String name;
    public int price;

    public Topping(int toppingId, String name, int price) {
        this.toppingId = toppingId;
        this.name = name;
        this.price = price;
    }

    public int getToppingId() {
        return toppingId;
    }

    public void setToppingId(int toppingId) {
        this.toppingId = toppingId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
