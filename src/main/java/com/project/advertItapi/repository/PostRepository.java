package com.project.advertItapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.advertItapi.entity.PostEntity;

@Repository
public interface PostRepository extends JpaRepository<PostEntity,Long> {
    
}
