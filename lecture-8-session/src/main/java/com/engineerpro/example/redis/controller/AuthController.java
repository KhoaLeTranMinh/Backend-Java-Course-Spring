package com.engineerpro.example.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.engineerpro.example.redis.dto.UploadImageRequest;
import com.engineerpro.example.redis.dto.UploadImageResponse;
import com.engineerpro.example.redis.dto.UserPrincipal;
import com.engineerpro.example.redis.service.UploadService;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping(path = "/auth")
public class AuthController {
  @GetMapping("/inspect")
  public ResponseEntity<UserPrincipal> inspect(Authentication authentication) {
    UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();
    log.info(String.format("authentication %s", userPrincipal.getId()));
    return ResponseEntity.ok().body((UserPrincipal) authentication.getPrincipal());
  }

  @GetMapping("/check-has-admin-role")
  @PreAuthorize("hasRole('ADMIN')")
  public Object sayHello(Authentication authentication) {
    return ResponseEntity.ok().body("has admin role");
  }

  @GetMapping("/check-has-user-role")
  @PreAuthorize("hasRole('ROLE_USER')")
  public Object getPrincipal(Authentication authentication) {
    return ResponseEntity.ok().body("has user role");
  }
}
