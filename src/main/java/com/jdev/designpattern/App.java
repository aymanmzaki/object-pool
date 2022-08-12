package com.jdev.designpattern;

public class App {
	
	public static void main(String[] args) {
		
		ServerPool pool= new ServerPool();
		Server server= pool.acquire("apibox");
		
		Server server2= pool.acquire("apibox");
//		pool.release(server);
		Server server3= pool.acquire("apibox");
		
		Server server4= pool.acquire("apibox");
		
		Server server5= pool.acquire("apibox");

	}

}
