package com.engineerpro.example.redis.controller.profile;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.engineerpro.example.redis.dto.profile.GetProfileResponse;
import com.engineerpro.example.redis.dto.profile.UpdateProfileImageRequest;
import com.engineerpro.example.redis.dto.profile.UpdateProfileImageResponse;
import com.engineerpro.example.redis.dto.profile.UpdateProfileRequest;
import com.engineerpro.example.redis.dto.profile.UpdateProfileResponse;

import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/profiles")
public class ProfileController {
  @PostMapping("/profile-image")
  public ResponseEntity<UpdateProfileImageResponse> updateProfileImage(
      @Valid @RequestBody UpdateProfileImageRequest request) {
    throw new RuntimeException("Not implemented error");
  }

  @PostMapping()
  public ResponseEntity<UpdateProfileResponse> updateProfile(
      @Valid @RequestBody UpdateProfileRequest request) {
    throw new RuntimeException("Not implemented error");
  }

  @GetMapping("/{id}")
  public ResponseEntity<GetProfileResponse> getProfile(@PathVariable int id) {
    throw new RuntimeException("Not implemented error");
  }
}
