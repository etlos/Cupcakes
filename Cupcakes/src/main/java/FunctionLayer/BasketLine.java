package FunctionLayer;

public class BasketLine {

    private String lineId;
    private int bottomId;
    private int toppingId;
    private String bottomName;
    private String toppingName;
    private int amount;
    private double sum;

    public BasketLine(String lineId, int bottomId, int toppingId, String bottomName, String toppingName, int amount, double sum) {
        this.lineId = lineId;
        this.bottomId = bottomId;
        this.toppingId = toppingId;
        this.bottomName = bottomName;
        this.toppingName = toppingName;
        this.amount = amount;
        this.sum = sum;
    }


    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public int getBottomId() {
        return bottomId;
    }

    public void setBottomId(int bottomId) {
        this.bottomId = bottomId;
    }

    public int getToppingId() {
        return toppingId;
    }

    public void setToppingId(int toppingId) {
        this.toppingId = toppingId;
    }

    public String getBottomName() {
        return bottomName;
    }

    public void setBottomName(String bottomName) {
        this.bottomName = bottomName;
    }

    public String getToppingName() {
        return toppingName;
    }

    public void setToppingName(String toppingName) {
        this.toppingName = toppingName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}
