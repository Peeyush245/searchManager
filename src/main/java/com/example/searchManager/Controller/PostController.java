package com.example.searchManager.Controller;

import com.example.searchManager.Model.Post;
import com.example.searchManager.Repository.PostRepository;
import com.example.searchManager.Repository.SearchRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepository repo;
    @Autowired
    SearchRepositoryImpl searchRepo;
    @GetMapping("/getPosts")
    public List<Post> getAllPosts() {
        return repo.findAll();
    }

    @GetMapping("/getPosts/{text}")
    public List<Post> getAllPosts(@PathVariable String text) {
        return searchRepo.findByText(text);
    }

    @PostMapping("/post")
    public void postJob(@RequestBody Post post) {
        repo.save(post);
    }
}
