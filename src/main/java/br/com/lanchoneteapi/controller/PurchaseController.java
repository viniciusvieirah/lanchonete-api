package br.com.lanchoneteapi.controller;


import br.com.lanchoneteapi.model.PurchaseModel;
import br.com.lanchoneteapi.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    @Autowired
    PurchaseService purchaseService;

    @PostMapping("")
    public ResponseEntity<Object> calculetLunchs(@RequestBody PurchaseModel purchasesLunchs){

        PurchaseModel retorno = purchaseService.calculateLunchs(purchasesLunchs);

        return ResponseEntity.ok().body(retorno) ;
    }

}
