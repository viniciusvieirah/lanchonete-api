package br.com.lanchoneteapi.service.impl;


import br.com.lanchoneteapi.model.Ingredient;
import br.com.lanchoneteapi.model.IngredientsEnum;
import br.com.lanchoneteapi.model.Lunch;
import br.com.lanchoneteapi.service.LunchService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class LunchServiceImpl implements LunchService {

    public final static String XBACCON = "x-Baccon";
    public final static String XBURGUER = "x-Burguer";
    public final static String XEGG = "x-egg";
    public final static String XEGGBACCON = "x-eggbaccon";
    public final static String CHOSSEYOUSERLF = "chosse";

    @Override
    public ArrayList <Lunch> listallLunchs(){

        ArrayList<Lunch> lunchs = new ArrayList<>();

        Lunch xBacon = assembleLunch(XBACCON);
        lunchs.add(xBacon);

        Lunch xBurger;
        xBurger = assembleLunch(XBURGUER);
        lunchs.add(xBurger);

        Lunch xEgg;
        xEgg = assembleLunch(XEGG);
        lunchs.add(xEgg);

        Lunch xEggBacon ;
        xEggBacon = assembleLunch(XEGGBACCON);
        lunchs.add(xEggBacon);


        return lunchs;
    }

    public Lunch assembleLunch(String name){
        Lunch lunch = new Lunch();
        ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
        lunch.setName(name);

        ingredients = assembleIngredient(name);
        lunch.setIngredients(ingredients);


        return lunch;
    }

    public ArrayList<Ingredient> assembleIngredient(String lunchName){
        ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();

        switch(lunchName){
            case XBACCON:
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


                break;
            case XBURGUER:
                ingredient = new Ingredient(IngredientsEnum.HAMBURGUER,1);
                ingredients.add(ingredient);

                ingredient = new Ingredient(IngredientsEnum.QUEIJO,1);
                ingredients.add(ingredient);

                ingredient = new Ingredient(IngredientsEnum.OVO,0);
                ingredients.add(ingredient);

                ingredient = new Ingredient(IngredientsEnum.ALFACE,0);
                ingredients.add(ingredient);

                ingredient = new Ingredient(IngredientsEnum.BACON,0);
                ingredients.add(ingredient);
                break;
            case XEGG:
                ingredient = new Ingredient(IngredientsEnum.OVO,1);
                ingredients.add(ingredient);

                ingredient = new Ingredient(IngredientsEnum.HAMBURGUER,1);
                ingredients.add(ingredient);

                ingredient = new Ingredient(IngredientsEnum.QUEIJO,1);
                ingredients.add(ingredient);

                ingredient = new Ingredient(IngredientsEnum.ALFACE,0);
                ingredients.add(ingredient);

                ingredient = new Ingredient(IngredientsEnum.BACON,0);
                ingredients.add(ingredient);
                break;
            case XEGGBACCON:

                ingredient = new Ingredient(IngredientsEnum.OVO,1);
                ingredients.add(ingredient);

                ingredient = new Ingredient(IngredientsEnum.BACON,1);
                ingredients.add(ingredient);

                ingredient = new Ingredient(IngredientsEnum.HAMBURGUER,1);
                ingredients.add(ingredient);

                ingredient = new Ingredient(IngredientsEnum.QUEIJO,1);
                ingredients.add(ingredient);

                ingredient = new Ingredient(IngredientsEnum.ALFACE,0);
                ingredients.add(ingredient);

                break;

            case CHOSSEYOUSERLF:
                ingredient = new Ingredient(IngredientsEnum.OVO,0);
                ingredients.add(ingredient);

                ingredient = new Ingredient(IngredientsEnum.BACON,0);
                ingredients.add(ingredient);

                ingredient = new Ingredient(IngredientsEnum.HAMBURGUER,0);
                ingredients.add(ingredient);

                ingredient = new Ingredient(IngredientsEnum.QUEIJO,0);
                ingredients.add(ingredient);

                ingredient = new Ingredient(IngredientsEnum.ALFACE,0);
                ingredients.add(ingredient);

                break;
            default:
                break;

        }

        return ingredients;
    }
}
