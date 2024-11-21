package com.sg.leo.controller;

import com.sg.leo.domain.User;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
@org.springframework.web.bind.annotation.RestController

public class RestController {
	
	@GetMapping("/jblog")
	public User httpGet() {
		User finduser = User.builder().id(1).username("ai").password("222").email("a@b.c").build();
		return finduser;
	}
	@PostMapping("/jblog")
	public String httpPost(@RequestBody User user) {
		return "Post요청 처리"+user.toString();
	}
	@PutMapping("/jblog")
	public String httpPut() {
		return "Put요청처리";
	}
	@DeleteMapping("/jblog")
	public String httpDelete() {
		return "Delete요청처리";
	}
}
