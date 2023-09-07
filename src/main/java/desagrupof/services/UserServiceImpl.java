package desagrupof.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import desagrupof.respositories.UserRepo;

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
}
