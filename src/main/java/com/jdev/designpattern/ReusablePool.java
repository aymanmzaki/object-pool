package com.jdev.designpattern;

import java.util.HashSet;

public abstract class ReusablePool<Reusable> {
	
	private static ReusablePool<?> pool;
	private HashSet<Reusable> locked, unlocked;
	private static int maxPoolSize =5;
	private static int currentUsedResources; 
	
	public ReusablePool() {
		locked = new HashSet<Reusable>();
		unlocked = new HashSet<Reusable>();
		currentUsedResources=0;
	}

	protected abstract Reusable create(String name);
	
	public synchronized Reusable acquire(String name) {
		
	    if (unlocked.isEmpty() && currentUsedResources<maxPoolSize) {
	    	unlocked.add(create(name));
	    	currentUsedResources++;
	    }
	    Reusable reusable = unlocked.iterator().next();
	    unlocked.remove(reusable);
	    locked.add(reusable);
		return reusable;
	}
	
	public void release(Reusable reusableObject) {
		locked.remove(reusableObject);
		unlocked.add(reusableObject);
	}

	public int getMaxPoolSize() {
		return maxPoolSize;
	}

	public void setMaxPoolSize(int maxPoolSize) {
		this.maxPoolSize = maxPoolSize;
	}
	

}
