package FunctionLayer;

public class Order {

private int orderId;
private String orderTime;
private String userId;
private int quantity;
private String toppingId;
private String bottomId;
private int sum;


    public Order(int orderId, String userId, int quantity, String toppingId, String bottomId, int sum) {
        this.orderId = orderId;
        this.userId = userId;
        this.quantity = quantity;
        this.toppingId = toppingId;
        this.bottomId = bottomId;
        this.sum = sum;
    }

    public int getOrderId() {
        return orderId;
    }
    public String getOrderTime() {
        return orderTime;
    }
    public String getUserId() {
        return userId;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getToppingId() {
        return toppingId;
    }
    public void setToppingId(String toppingId) {
        this.toppingId = toppingId;
    }
    public String getBottomId() {
        return bottomId;
    }
    public void setBottomId(String bottomId) {
        this.bottomId = bottomId;
    }
    public int getSum() {
        return sum;
    }
}
