package zadanie_2;

public class ShoopingBasket implements Basket{
    private String productName;
    private int price;

    public ShoopingBasket(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    public ShoopingBasket(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String addProduct() {
        setProductName(productName);
        return "Dodałeś produkt " + getProductName();
    }

    @Override
    public String removeProduct() {
        setProductName(productName);
        return "Usunąłes produkt " + getProductName();
    }

    @Override
    public int takeSum() {
        return 0;
    }
}
