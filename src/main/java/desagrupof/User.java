package desagrupof;

import desagrupof.validators.ValidPassword;
import org.springframework.stereotype.Component;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.math.BigInteger;

@Component
public class User {
    @NotBlank
    @Size(min =3, max=30)
    String name;
    @NotBlank
    @Size(min =3, max=30)
    String lastname;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    @ValidPassword
    private String password;
    @NotBlank
    @Size(min =1, max =30)
    private String adress;
    int reputation;
    int ammountOfTransactions;
    @NotBlank
    @Size(min=8, max=8)
    int cryptoAdress;
    @NotBlank
    @Size(min=22, max=22)
    BigInteger cvuMercadoPago;



    public User(){

    };
    public User(String name, String lastname, String email, String password, String adress, int cryptoAdress, BigInteger cvuMercadoPago){
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.adress = adress;
        this.reputation = 0;
        this.ammountOfTransactions = 0;
        this.cryptoAdress = cryptoAdress;
        this.cvuMercadoPago = cvuMercadoPago;
    }

    public String createUser(){
        return "Creado";
    }

}


