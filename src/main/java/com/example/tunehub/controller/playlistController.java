package com.example.tunehub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.tunehub.entites.Playlist;
import com.example.tunehub.entites.Song;
import com.example.tunehub.service.PlaylistService;
import com.example.tunehub.service.SongService;
@Controller
public class playlistController{
	@Autowired
	SongService service;
	
	@Autowired
	PlaylistService playlistservice;
	@GetMapping("/createplaylist")
	public String createplaylist(Model model) {
		List<Song> SongList = service.fetchAllSongs();
		model.addAttribute("songs", SongList);
		return "createplaylist";
	}
	
	
	@PostMapping("/addplaylist")
	public String addplaylist(@ModelAttribute Playlist playlist) {
		playlistservice.addplaylist(playlist);
		List<Song> SongList = playlist.getSongs();
		for(Song s: SongList) {
			s.getPlaylists().add(playlist);
			service.updateSong(s);
		}
		return "adminhome";
	}
	@GetMapping("/viewPlaylists")
	public String viewPlaylists(Model model) {
		List<Playlist> allplaylists  =playlistservice.fetchAllplaylists();
		model.addAttribute("allplaylists", allplaylists);
		return "displayplaylists";
		
	}
	
	
}