package com.engineerpro.example.redis.controller.profile;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.engineerpro.example.redis.dto.profile.FollowUserRequest;
import com.engineerpro.example.redis.dto.profile.FollowUserResponse;
import com.engineerpro.example.redis.dto.profile.GetFollowerResponse;
import com.engineerpro.example.redis.dto.profile.GetFollowingResponse;
import com.engineerpro.example.redis.dto.profile.UnFollowUserResponse;
import com.engineerpro.example.redis.dto.profile.UnfollowUserRequest;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping(path = "/follow")
public class FollowerController {
  @GetMapping("/user/followers/{id}")
  public ResponseEntity<GetFollowerResponse> getFollowers(@PathVariable int id, @RequestParam("page") int page,
      @RequestParam("limit") int limit) {
    log.info("userId={}, page={}, limit={}", id, page, limit);
    throw new RuntimeException("Not implemented error");
  }

  @GetMapping("/user/followings/{id}")
  public ResponseEntity<GetFollowingResponse> getFollowing(@PathVariable int id, @RequestParam("page") int page,
      @RequestParam("limit") int limit) {
    log.info("userId={}, page={}, limit={}", id, page, limit);
    throw new RuntimeException("Not implemented error");
  }

  @PutMapping()
  public ResponseEntity<FollowUserResponse> folowUser(
      @Valid @RequestBody FollowUserRequest request) {
    throw new RuntimeException("Not implemented error");
  }

  @DeleteMapping()
  public ResponseEntity<UnFollowUserResponse> unfolowUser(
      @Valid @RequestBody UnfollowUserRequest request) {
    throw new RuntimeException("Not implemented error");
  }
}
