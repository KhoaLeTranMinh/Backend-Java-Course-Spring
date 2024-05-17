package com.engineerpro.example.redis.controller.feed;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.engineerpro.example.redis.dto.feed.GetFeedResponse;
import com.engineerpro.example.redis.model.Post;
import com.engineerpro.example.redis.repository.PostRepository;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping(path = "/feeds")
public class FeedController {
  @Autowired
  PostRepository postRepository;

  @GetMapping()
  public ResponseEntity<GetFeedResponse> getFeed(@RequestParam("page") int page,
      @RequestParam("limit") int limit) {
    log.info("page={}, limit={}", page, limit);
    // test code, should be deleted
    List<Post> posts = postRepository.findAll();
    return ResponseEntity.ok(GetFeedResponse.builder().post(posts).build());
    // throw new RuntimeException("Not implemented error");
  }
}
