package org.generation.italy.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.generation.italy.demo.pojo.Movie;
import org.generation.italy.demo.pojo.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String getHome(Model model) {
		
		String name = "vincaf";

		model.addAttribute("name", name);
		
		return "home"; 
	}
	
	@GetMapping("/best-song")
	public String getBestSong(Model model) {
		
		List<Song> songs = new ArrayList<>();
		songs.add(new Song(1, "No More Tears - Ozzy Osbourne"));
		songs.add(new Song(2, "Are You Gonna Go My Way - Lenny Kravitz"));
		songs.add(new Song(3, "It's My Life - Bon Jovi"));
		songs.add(new Song(4, "Dark Necessities - Red Hot Chili Peppers"));
		
		model.addAttribute("songs", songs);
		
		return "best_song";
	}
	
	@GetMapping("/best-movie")
	public String getBestMovie(Model model) {
		
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie(1, "The Godfather"));
		movies.add(new Movie(2, "The Departed"));
		movies.add(new Movie(3, "Inglorious Bastards"));
		movies.add(new Movie(4, "Pulp Fiction"));
		
		model.addAttribute("movies", movies);
		
		return "best_movie";
	}

}
