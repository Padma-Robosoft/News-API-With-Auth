package com.rs.newsappwithauth.repository;

import com.rs.newsappwithauth.model.NewsArticle;
import jakarta.transaction.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NewsRepository extends JpaRepository<NewsArticle,Long> {
    List<NewsArticle> findByStatus(Status status);
}
