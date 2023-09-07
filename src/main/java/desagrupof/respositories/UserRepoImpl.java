package desagrupof.respositories;

import desagrupof.ExchangeSB;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;


@Repository
public class UserRepoImpl implements UserRepo{

    private static Logger LOG= LoggerFactory.getLogger(ExchangeSB.class);

    @Override
    public void register(String name) {
        LOG.info("Se registro el usuario " + name);
    }

    @Override
    public void login() {

    }
}
