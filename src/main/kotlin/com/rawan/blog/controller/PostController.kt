package com.rawan.blog.controller

import com.rawan.blog.model.Post
import com.rawan.blog.service.PostService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(value = ["/posts"])
class PostController(@Autowired private val postService: PostService) {

    @PostMapping
    fun save(@RequestBody post: Post): ResponseEntity<Post> {
        val body = postService.save(post)
        return ResponseEntity.ok().body(body)
    }
    @GetMapping
    fun findAll(): ResponseEntity<List<Post>> {
        val body = postService.findAll()
        return ResponseEntity.ok().body(body)
    }
}