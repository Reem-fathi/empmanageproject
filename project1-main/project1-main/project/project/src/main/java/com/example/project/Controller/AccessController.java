package com.example.project.Controller;

import com.example.project.dto.JwtRequest;
import com.example.project.dto.JwtResponse;
import com.example.project.dto.RegisterDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.project.service.EmpService;

@RestController
@RequestMapping("/controller")
public class AccessController {
  @Autowired
  private EmpService empService;
  @PostMapping("/register")
  public ResponseEntity<String> registerUser(@RequestBody RegisterDto registerdto){
    return empService.userRegister(registerdto);

  }
  @PostMapping("/login")
  public ResponseEntity<JwtResponse> userLogin(@RequestBody JwtRequest jwtRequest){
    return empService.loginUser(jwtRequest);

  }
}
