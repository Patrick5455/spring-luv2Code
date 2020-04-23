package com.hb.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "title")
	private String title;
	
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name = "instructor_id")
	private Instructor instructor;
	
	@Column(name = "course_id")
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Reviews> reviews;


	public Course() { 
	}

	public Course(String title) {
		this.title = title;
	}
	
	public List<Reviews> getReviews() {
		return reviews;
	}

	public void setReviews(List<Reviews> reviews) {
		this.reviews = reviews;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

//	@Override
//	public String toString() {
//		return "Course [id=" + id + ", title=" + title + ", instructor=" + instructor .toString()+ "]";
//	}
	
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + "]";
	}
	
	// add a convenience method fpr review
	
	public void addReview (Reviews newReview) {
		
		if (reviews == null) {
			
		reviews = new ArrayList<Reviews>();
		}
		
		reviews.add(newReview);
		
	}
	
	
	
	
	
	
	
	
	
}
