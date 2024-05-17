package com.engineerpro.example.redis.dto.feed;

import com.engineerpro.example.redis.model.Post;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DeleteCommentResponse {
  Post post;
}
