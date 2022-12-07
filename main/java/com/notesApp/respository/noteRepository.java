package com.notesApp.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.notesApp.entities.Note;

public interface noteRepository extends JpaRepository<Note, Integer> {
	
	public Note findById(int id);
	

}
