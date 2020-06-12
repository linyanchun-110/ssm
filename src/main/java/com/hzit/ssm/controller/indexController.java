package com.hzit.ssm.controller;

import com.hzit.ssm.service.indexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class indexController {
        @Autowired
        private indexService indexService;
        @RequestMapping("/show")
        public String showIndex(Model model){
            String name=indexService.query();
            System.out.println(name);
            model.addAttribute("name",name);
            return "index1";
    }
}
