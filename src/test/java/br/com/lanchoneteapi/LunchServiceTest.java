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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LunchServiceTest {
    @Autowired
    private LunchService lunchService;

    @Test
    public void testCallLunchs(){
        ArrayList<Lunch> lunches = new ArrayList<>();
        lunches = lunchService.listallLunchs();
        assertEquals(5, lunches.size());
    }



}
