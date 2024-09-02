package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	@Id
	private long id;
	private String title;
	private String discreption;
	public Course(long id, String title, String discreption) {
		super();
		this.id = id;
		this.title = title;
		this.discreption = discreption;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDiscreption() {
		return discreption;
	}
	public void setDiscreption(String discreption) {
		this.discreption = discreption;
	}
	@Override
	public String toString() {
		return "course [id=" + id + ", title=" + title + ", discreption=" + discreption + "]";
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
