package com.notesApp.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.notesApp.entities.Note;
import com.notesApp.respository.noteRepository;

@Component
public class noteService {
	
	@Autowired
	private noteRepository noteRepo;
	
	public List<Note> getAllNotes() {
		
	 List<Note> notes = this.noteRepo.findAll();
		return notes;
		
	}
	
	public Note getNoteById(int id) {
		
		Note note = this.noteRepo.findById(id);
		
		return note;	
	}

	public void deleteAll() {
		
		this.noteRepo.deleteAll();
		
	}
	
	public void deleteById(int id) {
		
		this.noteRepo.deleteById(id);
	}
	
	public Note  addNote(Note n) {
		
		
		
		Note result = (Note) this.noteRepo.save(n);
		System.out.println("Inside the service class" +result);
		return result;
	}
	
}
