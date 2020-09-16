package com.hyeop.jpapagingtest.Service;

import com.hyeop.jpapagingtest.Domain.User;
import com.hyeop.jpapagingtest.Domain.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

    @Autowired
    UserRepository userRepository;


    public Page<User> list(Pageable pageable) {
        return userRepository.findAll(pageable);
    }
}
