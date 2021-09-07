package com.rawan.blog.service

import com.rawan.blog.model.Post

interface PostService {
    fun findAll(): List<Post>
    fun save(post: Post): Post
}