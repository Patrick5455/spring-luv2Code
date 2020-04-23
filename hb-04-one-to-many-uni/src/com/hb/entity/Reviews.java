package com.hb.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "review")
public class Reviews {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id" )
	private int id;
	
	@Column(name = "comment")
	private String comment;
		
	public Reviews() {}

	public Reviews(String comment) {
		this.comment = comment;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Reviews [id=" + id + ", comment=" + comment + "]";
	}
	
	
	
	
	
	
	
	

}
