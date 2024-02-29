package com.abdelrhman.jpa.repositories;

import com.abdelrhman.jpa.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
