package desagrupof.respositories;

import desagrupof.User;

import java.math.BigInteger;

public interface UserRepo {
    public void register(String name);

    public void login();

    public User createUser(String name, String lastname, String email, String password, String adress, int cryptoAdress, BigInteger cvuMercadoPago);
}
