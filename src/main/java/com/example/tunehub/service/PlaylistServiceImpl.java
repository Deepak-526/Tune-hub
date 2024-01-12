package com.example.tunehub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tunehub.entites.Playlist;
import com.example.tunehub.repository.PlaylistRepository;
@Service
public class PlaylistServiceImpl implements PlaylistService {
    @Autowired
	PlaylistRepository repo;
	@Override
	public void addplaylist(Playlist playlist) {
		repo.save(playlist);
		
	}
	@Override
	public List<Playlist> fetchAllplaylists() {
		return repo.findAll();
	}

}
