import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private final String name;
    private int summ;
    private final Set<Product> products;

    public Recipe(String name, int summ, Set<Product> products) {
        if (name == null || name.isEmpty() || summ < 0 || products.size() == 0) {
            throw new IllegalArgumentException("Не заполнено поле");
        }else {
            this.name = name;
        }
        this.summ = summ;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public int getSumm() {
        summ = 0;
        for (Product product: products) {
            summ += product.getPrice();
        }
        return summ;
    }

    public Set<Product> getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return  Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    @Override
    public String toString() {
        return String.format("%s, цена: %s, количество: %s, Список продуктов: %s", this.name, this.summ, this.products);
    }
}
