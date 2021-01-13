package com.example.au.couchbasedemo.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

import com.sun.istack.NotNull;

@Document
public class Blogs {
    
    @Id
    String id;
    
    @NotNull
    @Field
    String topic;
    
    @NotNull
    @Field
    String author;
    
    @Field
    List<String> tags;
    
    @Field
    List<String>tags1;
    
    @Field
    List<String>tags2;
    
    
    @Field
    Date date;

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public void setTags1(List<String> tags1) {
		this.tags1 = tags1;
	}
	
	public List<String> getTags1() {
		return tags1;
	}
	
	public List<String> getTags2() {
		return tags2;
	}

	public void setTags2(List<String> tags2) {
		this.tags2 = tags2;
	}

	
	

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public Blogs(String id, String topic, String author, List<String> tags, Date date) {
		super();
		this.id = id;
		this.topic = topic;
		this.author = author;
		this.tags = tags;
		this.date = date;
	}
    
    
    
}
