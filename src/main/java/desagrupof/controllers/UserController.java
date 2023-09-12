package desagrupof.controllers;


import desagrupof.User;
import desagrupof.respositories.UserRepoImpl;
import desagrupof.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("/repositories.UserRepoImpl")

public class UserController {

    @Autowired
    UserServiceImpl userService;

    @PostMapping
    public User createUser(String name, String lastname, String email, String password, String adress, int cryptoAdress, BigInteger cvuMercadoPago){
        return userService.createUser(name,lastname,email,password,adress,cryptoAdress,cvuMercadoPago);
    }

}
