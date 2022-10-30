import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

 public class Product {
    private final String name;
    private final int price;
    private final int count;
    private  boolean checked;

    public Product(String name, int price, int count) {
        if (name == null || name.isEmpty() || price < 0 || count < 0) {
        throw new IllegalArgumentException("Не заполнено поле");
        }
        this.name = name;
        this.price = price;
        this.count = count;
        this.checked = false;
    }

    public String getName() {
        return name;
    }


    public int getPrice() {
        return price;
    }


    public int getCount() {
        return count;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked() {
        this.checked = true;
    }

    @Override
    public String toString() {
        String checkedString = this.isChecked() ? "Да" : "Нет";
        return String.format("%s, цена: %s, количество: %s, Куплен: %s", this.name, this.price, this.count, checkedString);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
