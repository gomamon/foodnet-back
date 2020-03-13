package com.foodnet.springboot.controller;

import com.foodnet.springboot.model.PostModel;
import com.foodnet.springboot.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PostController {
    @Autowired
    PostService postService;


    @RequestMapping("/list")
    public @ResponseBody String list(Model model) throws Exception{
        PostModel post = postService.printPost();

        model.addAttribute("id", post.getId());
        model.addAttribute("title", post.getTitle());
        model.addAttribute("content", post.getContent());
        model.addAttribute("regi_date", post.getRegi_time());

        return model.toString();
    }

    @RequestMapping(value="/add", method=RequestMethod.POST )
    public @ResponseBody String add(PostModel model) throws Exception{
        System.out.println("requestMethodPost");

        postService.addPost(model);

        return "success";
    }

}
