package com.hb.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "instructor_detail")
public class InstructorDetail {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int id;
	
	@Column(name ="youtube_channel")
	private String youtubeChannel;
	
	@Column(name = "hobby")
	private String hobby;	
	
	//@OneToOne(mappedBy = "instructorDetail", cascade = CascadeType.ALL) 
	// used for Cascade of all action)
	
	@OneToOne(mappedBy = "instructorDetail", cascade = {CascadeType.DETACH,CascadeType.PERSIST,CascadeType.MERGE, CascadeType.REFRESH}) 
	// used for single action for delete. 
	//There will not be a Cascade for delete because we are not using Cascade.ALL and we do not specify Cascade.Remove
	
	// the mapped by value tells hibernate where to look for the reference
	// of InstructorDetail as a FK in Instructor
	private Instructor instructor;

	public InstructorDetail() {
	}

	public InstructorDetail(String youtubeChannel, String hobby) {
		this.youtubeChannel = youtubeChannel;
		this.hobby = hobby;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getYoutubeChannel() {
		return youtubeChannel;
	}

	public void setYoutubeChannel(String youtubeChannel) {
		this.youtubeChannel = youtubeChannel;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	@Override
	public String toString() {
		return "InstructorDetail [youtubeChannel=" + youtubeChannel + ", hobby=" + hobby + ", instructor=" + instructor
				+ "]";
	}
	
	
	
	
	

}
