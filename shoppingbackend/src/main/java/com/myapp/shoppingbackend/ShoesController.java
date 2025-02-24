package com.myapp.shoppingbackend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/shoes")
public class ShoesController {

    private final ShoesService shoesService;

    @Autowired
    public ShoesController(ShoesService shoesService) {
        this.shoesService = shoesService;
    }

        @GetMapping
    public List<Shoes> getAllShoes( ) {
        return
                shoesService.getShoes();
    }
}
