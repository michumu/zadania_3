package zadanie_2;

public class OnlineBasket implements Basket {
    private String productName;
    private int price;
    private boolean isOnSale;

    public OnlineBasket(String productName, int price, boolean isOnSale) {
        this.productName = productName;
        this.price = price;
        this.isOnSale = isOnSale;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isOnSale() {
        return isOnSale;
    }

    public void setOnSale(boolean onSale) {
        isOnSale = onSale;
    }

    @Override
    public String addProduct() {
        if(isOnSale) {
            setProductName(productName);
            setPrice(price);
        } else {
            return "Brak produktu w sklepie";
        }
        return "Dodałeś produkt " + getProductName();
    }

    @Override
    public String removeProduct() {
        return null;
    }

    @Override
    public int takeSum() {
        return 0;
    }
}
