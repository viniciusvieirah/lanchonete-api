package br.com.lanchoneteapi.controller;


import br.com.lanchoneteapi.model.Lunch;

import br.com.lanchoneteapi.service.LunchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/lunch")
public class LunchController {

    @Autowired
    private LunchService lunchService;


    @GetMapping("")
    public ResponseEntity<Object> listAllLunchs(){
        ArrayList<Lunch> lunches = new ArrayList<>();
        lunches = lunchService.listallLunchs();
        return ResponseEntity.ok().body(lunches);
    }
}
