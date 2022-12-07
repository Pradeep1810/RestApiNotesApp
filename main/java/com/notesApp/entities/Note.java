package com.notesApp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Note_App")
public class Note {

	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	
	private String title;
	private String descript;
	
	public Note(int id, String title, String descript) {
		super();
		this.id = id;
		this.title = title;
		this.descript = descript;
	}
	
	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getdescript() {
		return descript;
	}
	public void setdescript(String descript) {
		this.descript = descript;
	}

	@Override
	public String toString() {
		return "Note [id=" + id + ", title=" + title + ", descript=" + descript + "]";
	}
	

}
