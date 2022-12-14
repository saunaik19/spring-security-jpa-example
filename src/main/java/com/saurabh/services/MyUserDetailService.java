package com.saurabh.services;

import com.saurabh.dao.UserRepository;
import com.saurabh.dto.MyUserDetails;
import com.saurabh.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> user=userRepository.findByUserName(userName);
        user.orElseThrow(()->new UsernameNotFoundException(userName+" user not found..."));
        return user.map(MyUserDetails::new).get();
    }
}
