package com.jdev.designpattern;

public class ServerPool extends ReusablePool<Server> {

	@Override
	protected Server create(String name) {
		Server server= new Server(name);
		System.out.println(server.toString());
		return server;
	}

}
