package com.foodnet.springboot.service.impl;

import com.foodnet.springboot.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;

import com.foodnet.springboot.dao.PostDao;
import com.foodnet.springboot.model.PostModel;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostDao dao;

    @Override
    public PostModel printPost() {
        PostModel post = dao.getPost();
        return post;
    }
}
