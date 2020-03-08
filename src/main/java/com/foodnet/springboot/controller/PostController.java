package com.foodnet.springboot.controller;

import com.foodnet.springboot.model.PostModel;
import com.foodnet.springboot.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {
    @Autowired
    PostService postService;


    @RequestMapping("/list")
    public @ResponseBody String list(Model model) throws Exception{
        PostModel post = postService.printPost();

        model.addAttribute("id", post.getId());
        model.addAttribute("subject", post.getSubject());
        model.addAttribute("content", post.getContent());
        model.addAttribute("reg_date", post.getReg_date());

        return model.toString();
    }
}
