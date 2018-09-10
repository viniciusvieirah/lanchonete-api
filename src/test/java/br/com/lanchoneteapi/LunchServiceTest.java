package br.com.lanchoneteapi;


import br.com.lanchoneteapi.model.Lunch;
import br.com.lanchoneteapi.service.LunchService;
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
    @Test
    public void testCallLunchs(){
        ArrayList<Lunch> lunches = new ArrayList<>();
        lunches = lunchService.listallLunchs();
        Assert.assertEquals(6, lunches.size());
    }

}
