package br.com.lanchoneteapi.service.impl;

import br.com.lanchoneteapi.model.Ingredient;
import br.com.lanchoneteapi.model.IngredientsEnum;
import br.com.lanchoneteapi.model.Lunch;
import br.com.lanchoneteapi.model.PurchaseModel;
import br.com.lanchoneteapi.service.PurchaseService;
import org.springframework.stereotype.Service;

@Service
public class PurchaseServiceImpl implements PurchaseService {



    @Override
    public PurchaseModel calculateLunchs(PurchaseModel purchase) {
        //vai passar por todos os lanches para calcular os preços
         Double totalCost = 0d;

        for (int i = 0; i < purchase.getLunchs().size(); i++) {
            //validar de cada lanche o ingredientes, para entrar na promoçao
            Lunch lunch = purchase.getLunchs().get(i);
            double costLunch = 0d;

            boolean discount = false;

            for (int j = 0; j <  purchase.getLunchs().get(i).getIngredients().size() ; j++) {
                Double costIngredient = 0d;

                switch (lunch.getIngredients().get(j).getName()){

                    case "alface":
                        if(lunch.getIngredients().get(j).getQtd() > 0){
                            discount = true;
                        }
                        costIngredient = IngredientsEnum.ALFACE.getCost() * lunch.getIngredients().get(j).getQtd();
                        break;
                    case "baccon":
                        if(lunch.getIngredients().get(i).getQtd() > 0){
                            discount = false;
                        }
                        costIngredient = IngredientsEnum.BACON.getCost() * lunch.getIngredients().get(j).getQtd();

                        break;
                    case "hamburguer":
                        costIngredient = totalCostIngredientPromotional(lunch.getIngredients().get(j).getQtd() , IngredientsEnum.HAMBURGUER.getCost() );
                        break;
                    case "ovo":
                        costIngredient = IngredientsEnum.OVO.getCost() * lunch.getIngredients().get(j).getQtd();
                        break;
                    case "queijo":
                        costIngredient = totalCostIngredientPromotional(lunch.getIngredients().get(j).getQtd() , lunch.getIngredients().get(j).getCost());
                        break;
                     default:
                         costIngredient = 0d;
                         break;
                }

                purchase.getLunchs().get(i).getIngredients().get(j).setCost(costIngredient);



                costLunch+=costIngredient;
            }

            if(discount){
                costLunch = costLunch - (costLunch*0.1);
            }

            totalCost +=costLunch;

            purchase.getLunchs().get(i).setCost(costLunch);


        }

        purchase.setTotalCost(totalCost);

        return purchase;
    }


    public double totalCostIngredientPromotional(int qtd , double unitCost){
        Double totalCost = 0d;
        int qtdPaga = qtd - ( qtd/3);
        totalCost = qtdPaga*unitCost;


        return totalCost;
    }
}
