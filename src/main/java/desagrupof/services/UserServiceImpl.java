package desagrupof.services;

import desagrupof.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import desagrupof.respositories.UserRepo;

import java.math.BigInteger;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepository;
    @Override
    public void register(String name) {
        userRepository.register(name);
    }

    @Override
    public void login() {
        userRepository.login();
    }

    public User createUser(String name, String lastname, String email, String password, String adress, int cryptoAdress, BigInteger cvuMercadoPago){
        return userRepository.createUser(name, lastname, email, password, adress, cryptoAdress, cvuMercadoPago);
    }
}
