package model;

public class Purchase {
    private String item;
    private int amount;
    private boolean noStock;

    public Purchase(String item, int amount, boolean noStock) {
        this.item = item;
        this.amount = amount;
        this.noStock = noStock;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isNoStock() {
        return noStock;
    }

    public void setNoStock(boolean noStock) {
        this.noStock = noStock;
    }

    @Override
    public String toString() {
        return "Purchase {" +
                "item='" + item + '\'' +
                ", amount=" + amount +
                ", soStock=" + noStock +
                '}';
    }
}
