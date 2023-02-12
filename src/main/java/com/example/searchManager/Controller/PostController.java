package com.example.searchManager.Controller;

import com.example.searchManager.Model.Post;
import com.example.searchManager.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepository repo;
    @GetMapping("/getPosts")
    public List<Post> getAllPosts() {
        return repo.findAll();
    }

    @PostMapping("/post")
    public void postJob(@RequestBody Post post) {
        repo.save(post);
    }
}
