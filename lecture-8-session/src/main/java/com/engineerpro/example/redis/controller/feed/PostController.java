package com.engineerpro.example.redis.controller.feed;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.engineerpro.example.redis.dto.feed.CreatePostRequest;
import com.engineerpro.example.redis.dto.feed.CreatePostResponse;
import com.engineerpro.example.redis.dto.feed.DeletePostResponse;
import com.engineerpro.example.redis.dto.feed.GetUserPostResponse;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping(path = "/posts")
public class PostController {

  @PutMapping()
  public ResponseEntity<CreatePostResponse> createPost(
      @Valid @RequestBody CreatePostRequest request) {
    throw new RuntimeException("Not implemented error");
  }

  @GetMapping("/{id}")
  public ResponseEntity<CreatePostResponse> getPost(@PathVariable int id) {
    throw new RuntimeException("Not implemented error");
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<DeletePostResponse> deletPost(@PathVariable int id) {
    throw new RuntimeException("Not implemented error");
  }

  @PutMapping("/like/{id}")
  public ResponseEntity<CreatePostResponse> likePost(@PathVariable int id) {
    throw new RuntimeException("Not implemented error");
  }

  @DeleteMapping("/like/{id}")
  public ResponseEntity<CreatePostResponse> unlikePost(@PathVariable int id) {
    throw new RuntimeException("Not implemented error");
  }

  @GetMapping("/user/{id}")
  public ResponseEntity<GetUserPostResponse> getUserPosts(@PathVariable int id) {
    throw new RuntimeException("Not implemented error");
  }
}
