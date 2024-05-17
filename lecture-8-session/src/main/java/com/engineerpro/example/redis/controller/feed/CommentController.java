package com.engineerpro.example.redis.controller.feed;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.engineerpro.example.redis.dto.feed.CreateCommentRequest;
import com.engineerpro.example.redis.dto.feed.CreateCommentResponse;
import com.engineerpro.example.redis.dto.profile.UnFollowUserResponse;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping(path = "/comments")
public class CommentController {
  @PutMapping()
  public ResponseEntity<CreateCommentResponse> createComment(
      @Valid @RequestBody CreateCommentRequest request) {
    throw new RuntimeException("Not implemented error");
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<UnFollowUserResponse> deleteComment(@PathVariable int id) {
    throw new RuntimeException("Not implemented error");
  }
}
