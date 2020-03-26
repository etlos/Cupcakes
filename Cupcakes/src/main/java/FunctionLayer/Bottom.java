package FunctionLayer;

public class Bottom {

    public int bottomId;
    public String name;
    public int price;

    public Bottom(int bottomId, String name, int price) {
        this.bottomId = bottomId;
        this.name = name;
        this.price = price;
    }

    public int getBottomId() {
        return bottomId;
    }

    public void setBottomId(int bottomId) {
        this.bottomId = bottomId;
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

