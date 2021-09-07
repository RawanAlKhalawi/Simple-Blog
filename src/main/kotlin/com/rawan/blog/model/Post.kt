package com.rawan.blog.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Post(
        @Id val id: String?,
        val title: String,
        val post: String
)