package com.spring.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.api.entity.Album;

public interface AlbumRepository extends JpaRepository<Album, Integer> {

}
