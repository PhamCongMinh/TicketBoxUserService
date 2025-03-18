package org.boilerplate.ticketboxuserservice.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.boilerplate.ticketboxuserservice.database.model.User;
import org.boilerplate.ticketboxuserservice.database.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }

    public Optional<User> findById(Integer id) {
        return userRepository.findById(id);
    }
}
