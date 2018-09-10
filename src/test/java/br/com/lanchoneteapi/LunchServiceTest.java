package br.com.lanchoneteapi;


import br.com.lanchoneteapi.model.Ingredient;
import br.com.lanchoneteapi.model.IngredientsEnum;
import br.com.lanchoneteapi.model.Lunch;
import br.com.lanchoneteapi.model.PurchaseModel;
import br.com.lanchoneteapi.service.LunchService;
import br.com.lanchoneteapi.service.PurchaseService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LunchServiceTest {
    private LunchService lunchService;
    private PurchaseService purchaseService;
    @Test
    public void testCallLunchs(){
        ArrayList<Lunch> lunches = new ArrayList<>();
        lunches = lunchService.listallLunchs();
        Assert.assertEquals(6, lunches.size());
    }

    @Test
    public void testLanchPrice(){
        ArrayList<Lunch> lunches = new ArrayList<>();
        Lunch lunch = new Lunch();
        PurchaseModel purchase = new PurchaseModel();

        ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
        Ingredient ingredient = new Ingredient(IngredientsEnum.BACON,1);
        ingredients.add(ingredient);

        ingredient = new Ingredient(IngredientsEnum.HAMBURGUER,1);
        ingredients.add(ingredient);

        ingredient = new Ingredient(IngredientsEnum.QUEIJO,1);
        ingredients.add(ingredient);

        ingredient = new Ingredient(IngredientsEnum.ALFACE,0);
        ingredients.add(ingredient);

        ingredient = new Ingredient(IngredientsEnum.OVO,0);
        ingredients.add(ingredient);

        lunch.setIngredients(ingredients);
        lunches.add(lunch);

        purchase.setLunchs(lunches);

        purchase = purchaseService.calculateLunchs(purchase);

        Assert.assertEquals(6.5, purchase.getTotalCost());



    }

}
