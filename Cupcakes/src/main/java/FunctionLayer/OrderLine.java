package FunctionLayer;

public class OrderLine {

    private int orderLineId;
    private int orderId;
    private int toppingId;
    private int bottomId;
    private int quantity;
    private int sum;

    public OrderLine(int orderLineId, int orderId, int toppingId, int bottomId, int quantity, int sum) {
        this.orderLineId = orderLineId;
        this.orderId = orderId;
        this.toppingId = toppingId;
        this.bottomId = bottomId;
        this.quantity = quantity;
        this.sum = sum;
    }

    public int getOrderLineId() {
        return orderLineId;
    }

    public void setOrderLineId(int orderLineId) {
        this.orderLineId = orderLineId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getToppingId() {
        return toppingId;
    }

    public void setToppingId(int toppingId) {
        this.toppingId = toppingId;
    }

    public int getBottomId() {
        return bottomId;
    }

    public void setBottomId(int bottomId) {
        this.bottomId = bottomId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}

