package com.example.tunehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tunehub.entites.Playlist;

public interface PlaylistRepository extends JpaRepository<Playlist, Integer> {

}
