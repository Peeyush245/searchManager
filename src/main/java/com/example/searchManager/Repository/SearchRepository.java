package com.example.searchManager.Repository;

import com.example.searchManager.Model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
