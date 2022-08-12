package com.jdev.designpattern;

import java.util.UUID;

public class Server {
	
	private String name;
	private UUID number;
	private Long creationTime;
		
	public Server(String name) {
		this.name=name;
		this.number= UUID.randomUUID();
		this.creationTime=System.currentTimeMillis();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public UUID getNumber() {
		return number;
	}

	public Long getCreationTime() {
		return creationTime;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(name);
		builder.append(":");
		builder.append(number);
		return builder.toString();
	}
	
}
