package com.myapp.shoppingbackend;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@Service
public class ShoesService {


    public List<Shoes> getShoes (){
        return List.of(
                new Shoes(
                        "addidas",
                        "red",
                        "20",
                        20,
                        2,
                        "messi addidad",
                        "messi addidas",
                        "img"

                )
        );
    }
}
