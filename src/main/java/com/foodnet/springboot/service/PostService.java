package com.foodnet.springboot.service;

import com.foodnet.springboot.model.PostModel;

public interface PostService {

    public PostModel printPost();
    public void addPost(PostModel model) throws Exception;
}
