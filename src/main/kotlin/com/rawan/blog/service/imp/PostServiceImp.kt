package com.rawan.blog.service.imp

import com.rawan.blog.model.Post
import com.rawan.blog.repository.PostRepository
import com.rawan.blog.service.PostService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PostServiceImp(@Autowired private val postRepository: PostRepository) : PostService {

    override fun findAll(): List<Post> {
        return postRepository.findAll()
    }

    override fun save(post: Post): Post {
        return postRepository.save(post)
    }
}