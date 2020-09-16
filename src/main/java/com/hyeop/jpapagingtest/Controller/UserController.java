package com.hyeop.jpapagingtest.Controller;

import com.hyeop.jpapagingtest.Facade.UserFacade;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class UserController {

    @Autowired
    private UserFacade userFacade;

    @GetMapping("index")
    public String index(Model model){
        model.addAttribute("name", "wow");
        log.info("{}",userFacade.list(PageRequest.of(1,5)).toString());
        return "index";
    }

    @GetMapping("/user")
    public String user(Model model, Pageable pageable){

        model.addAttribute("user", userFacade.list(pageable));
        return "user";
    }

}
