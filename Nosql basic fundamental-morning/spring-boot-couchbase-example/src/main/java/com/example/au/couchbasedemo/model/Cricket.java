package com.example.au.couchbasedemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

@Document
public class Cricket {
	
	@Id
	private String cricketId;
	private String name;
	private int noOfRuns;
	private int average;
	private int noOfWicket;
	public String getCricketId() {
		return cricketId;
	}
	public void setCricketId(String cricketId) {
		this.cricketId = cricketId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfRuns() {
		return noOfRuns;
	}
	public void setNoOfRuns(int noOfRuns) {
		this.noOfRuns = noOfRuns;
	}
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	public int getNoOfWicket() {
		return noOfWicket;
	}
	public void setNoOfWicket(int noOfWicket) {
		this.noOfWicket = noOfWicket;
	}

}
