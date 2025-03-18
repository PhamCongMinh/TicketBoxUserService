package org.boilerplate.ticketboxuserservice.service.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.boilerplate.ticketboxuserservice.database.model.User;
import org.boilerplate.ticketboxuserservice.database.repository.UserRepository;

import java.util.Optional;


@Service
public class UserDetailService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByEmail(username); // Assuming 'email' is used as username
        return user.orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));
    }
}
