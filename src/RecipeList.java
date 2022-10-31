import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RecipeList {
    private final Set<Recipe> recipes = new HashSet<>();

    public void addRecipe(Recipe recipe) {
        for (Recipe recipe1: this.recipes) {
            if (recipe.getName().equals(recipe1.getName())) {
                throw new AddException("Рецепт уже есть");
            } else {
                this.recipes.add(recipe);
            }
        }

    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список рецептов: ").append('\n');
        for (Recipe recipe : this.recipes) {
            stringBuilder.append(recipe).append('\n');
        }
        return stringBuilder.toString();
    }


}
