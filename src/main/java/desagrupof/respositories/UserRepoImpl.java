package desagrupof.respositories;

import desagrupof.ExchangeSB;
import desagrupof.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;


@Repository
public class UserRepoImpl implements UserRepo{

    private static Logger LOG= LoggerFactory.getLogger(ExchangeSB.class);

    @Autowired
    User user;
    @Override
    public void register(String name) {
        LOG.info("Se registro el usuario " + name);
    }

    @Override
    public void login() {

    }
    @Override
    public User createUser(String name, String lastname, String email, String password, String adress, int cryptoAdress, BigInteger cvuMercadoPago){
        return new User(name, lastname, email, password,adress, cryptoAdress, cvuMercadoPago);
    }
}
