import java.util.*;

public class Main {
    public static void main(String[] args) {
        Product banana = new Product("Банан", 30, 2);
        Product apple = new Product("Яблоко", 50, 21);
        Product kivi = new Product("Киви", 24, 5);

        ProductList productList = new ProductList();
        productList.addProduct(banana,1);
        productList.addProduct(apple,2);
        productList.addProduct(kivi,3);
        System.out.println(productList);

        Recipe r1 = new Recipe("R1", 104, Map.of(banana, 1));
        Recipe r2 = new Recipe("R1", 104, Map.of(banana, 2));

        RecipeList recipeList = new RecipeList();
        recipeList.addRecipe(r1);
        recipeList.addRecipe(r2);
        System.out.println(recipeList);
        numbersSetRemove();

    }

    public static void numbersSetRemove() {
        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}