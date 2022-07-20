package com.project.advertItapi.services;

import java.util.List;

import com.project.advertItapi.model.Post;

public interface PostService {
    Post createPost(Post post);

    List<Post> getAllPosts();
}
