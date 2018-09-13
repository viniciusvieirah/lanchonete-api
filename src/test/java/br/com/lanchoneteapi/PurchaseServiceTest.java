package br.com.lanchoneteapi;

import br.com.lanchoneteapi.model.Ingredient;
import br.com.lanchoneteapi.model.IngredientsEnum;
import br.com.lanchoneteapi.model.Lunch;
import br.com.lanchoneteapi.model.PurchaseModel;
import br.com.lanchoneteapi.service.PurchaseService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PurchaseServiceTest {

    @Autowired
    PurchaseService purchaseService;
    @Test
    public void testSimpleLunchPrice(){
        double valorEsperado = 6.5;
        double valorCalculado= 0d;

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

        valorCalculado = purchase.getTotalCost();

        Assert.assertEquals(valorCalculado,valorEsperado, 0.1);

    }



    @Test
    public void testPromotionLight(){
        double valorEsperado = 4.41;
        double valorCalculado= 0d;

        ArrayList<Lunch> lunches = new ArrayList<>();
        Lunch lunch = new Lunch();
        PurchaseModel purchase = new PurchaseModel();

        ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
        Ingredient ingredient = new Ingredient(IngredientsEnum.BACON,0);
        ingredients.add(ingredient);

        ingredient = new Ingredient(IngredientsEnum.HAMBURGUER,1);
        ingredients.add(ingredient);

        ingredient = new Ingredient(IngredientsEnum.QUEIJO,1);
        ingredients.add(ingredient);

        ingredient = new Ingredient(IngredientsEnum.ALFACE,1);
        ingredients.add(ingredient);

        ingredient = new Ingredient(IngredientsEnum.OVO,0);
        ingredients.add(ingredient);

        lunch.setIngredients(ingredients);
        lunches.add(lunch);

        purchase.setLunchs(lunches);

        purchase = purchaseService.calculateLunchs(purchase);

        valorCalculado = purchase.getTotalCost();

        Assert.assertEquals(valorCalculado,valorEsperado, 0.1);

    }

    @Test
    public void testPromotionMeat(){
        double valorEsperado = 7.11;
        double valorCalculado= 0d;

        ArrayList<Lunch> lunches = new ArrayList<>();
        Lunch lunch = new Lunch();
        PurchaseModel purchase = new PurchaseModel();

        ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
        Ingredient ingredient = new Ingredient(IngredientsEnum.BACON,0);
        ingredients.add(ingredient);

        ingredient = new Ingredient(IngredientsEnum.HAMBURGUER,3);
        ingredients.add(ingredient);

        ingredient = new Ingredient(IngredientsEnum.QUEIJO,1);
        ingredients.add(ingredient);

        ingredient = new Ingredient(IngredientsEnum.ALFACE,1);
        ingredients.add(ingredient);

        ingredient = new Ingredient(IngredientsEnum.OVO,0);
        ingredients.add(ingredient);

        lunch.setIngredients(ingredients);
        lunches.add(lunch);

        purchase.setLunchs(lunches);

        purchase = purchaseService.calculateLunchs(purchase);

        valorCalculado = purchase.getTotalCost();

        Assert.assertEquals(valorCalculado,valorEsperado, 0.1);

    }


    @Test
    public void testPromotionCheese(){
        double valorEsperado = 5.76;
        double valorCalculado= 0d;

        ArrayList<Lunch> lunches = new ArrayList<>();
        Lunch lunch = new Lunch();
        PurchaseModel purchase = new PurchaseModel();

        ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
        Ingredient ingredient = new Ingredient(IngredientsEnum.BACON,0);
        ingredients.add(ingredient);

        ingredient = new Ingredient(IngredientsEnum.HAMBURGUER,1);
        ingredients.add(ingredient);

        ingredient = new Ingredient(IngredientsEnum.QUEIJO,3);
        ingredients.add(ingredient);

        ingredient = new Ingredient(IngredientsEnum.ALFACE,1);
        ingredients.add(ingredient);

        ingredient = new Ingredient(IngredientsEnum.OVO,0);
        ingredients.add(ingredient);

        lunch.setIngredients(ingredients);
        lunches.add(lunch);

        purchase.setLunchs(lunches);

        purchase = purchaseService.calculateLunchs(purchase);

        valorCalculado = purchase.getTotalCost();

        Assert.assertEquals(valorCalculado,valorEsperado, 0.1);

    }


}
