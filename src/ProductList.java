import java.util.*;

public class ProductList {
    private final Map<Product, Integer> products = new HashMap<>();

    public void addProduct(Product product, Integer count) {
        if (products.containsKey(product)) {
            throw new AddException("Продукт уже есть");
        } else {
            this.products.put(product, count);
        }
    }

    public void checkProduct(Product product) {
            if (products.containsKey(product)) {
                product.setChecked();
            }

    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    @Override
    public String toString() {
            return String.format("Продукты: " + products);
    }
}
