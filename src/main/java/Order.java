public class Order {

    private Customer customer;
    private Product product;
    private int quanity;
    private long orderDate;

    public Order() {
    }

    public Order(Customer customer, Product product, int quanity, long orderDate) {
        this.customer = customer;
        this.product = product;
        this.quanity = quanity;
        this.orderDate = orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public long getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(long orderDate) {
        this.orderDate = orderDate;
    }
}
