package desagrupof;

import desagrupof.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "desagrupof")
public class ExchangeSB implements CommandLineRunner {

    private static Logger LOG= LoggerFactory.getLogger(ExchangeSB.class);

    @Autowired
    private  UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(ExchangeSB.class, args);

    }


    @Override
    public void run(String... args) throws Exception {
        userService.register("Anahi");
    }
}