package com.notesApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.notesApp.entities.Note;
import com.notesApp.services.noteService;

@RestController
@CrossOrigin
public class NoteController {
	
	@Autowired noteService noteServ;
	
	@GetMapping("/getNotes")
	public List<Note> getNotes() {
		
	List<Note> notes =	this.noteServ.getAllNotes();
		return notes;	
		
	}
	
	@GetMapping("/getNotes/{id}")
	public Note getNote(@PathVariable("id") int id) {
		
		Note note = this.noteServ.getNoteById(id);
		return note;

	}
	
	@PostMapping("/addNote")
	public Note addNote(@RequestBody Note note)
		{
			Note n = this.noteServ.addNote(note);
			return n;
		}
	
	

}
