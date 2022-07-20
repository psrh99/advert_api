package com.project.advertItapi.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.project.advertItapi.entity.PostEntity;
import com.project.advertItapi.model.Post;
import com.project.advertItapi.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService{
    
    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Post createPost(Post post) {
        PostEntity postEntity = new PostEntity();
        
        BeanUtils.copyProperties(post, postEntity);
        postRepository.save(postEntity);

        return post;
    }

    @Override
    public List<Post> getAllPosts() {
        List<PostEntity> postEntities = postRepository.findAll();
        
        List<Post> posts = postEntities
                            .stream()
                            .map(pst -> new Post(
                                pst.getId(),
                                pst.getTitle(),
                                pst.getPrice(),
                                pst.getDescription(),
                                pst.getImageUrl(),
                                pst.getCategory()))
                            .collect(Collectors.toList());
    
            return posts;
        }
    
}
