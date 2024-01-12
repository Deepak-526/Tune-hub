package com.example.tunehub.service;

import java.util.List;

import com.example.tunehub.entites.Playlist;

public interface PlaylistService {
	
	public  void addplaylist(Playlist playlist);

	public List<Playlist> fetchAllplaylists();

}
