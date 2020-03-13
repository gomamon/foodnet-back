package com.foodnet.springboot.dao;

import com.foodnet.springboot.model.PostModel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PostDao {
    public PostModel getPost();

    public void addPost(PostModel model) throws Exception;


}

