package com.hyeop.jpapagingtest.Facade;

import com.hyeop.jpapagingtest.Domain.User;
import com.hyeop.jpapagingtest.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Component
public class UserFacade {

    @Autowired
    private UserService userService;

    public Page<User> list(Pageable pageable) {
        return userService.list(pageable);
    }
}
