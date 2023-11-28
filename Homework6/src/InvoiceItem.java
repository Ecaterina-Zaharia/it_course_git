public class InvoiceItem {
    private int id;
    private String description;
    private int quantity;
    private int price;

    public InvoiceItem(int id, String description, int quantity, int price) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public int getTotal(){
        int totalPrice = 0;
        totalPrice = quantity * price;
        return totalPrice;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
