package com.cg.lb4.model;
public abstract class MediaItem extends Item{
	int runTime;

	public MediaItem(Integer id, String title, Integer nocopies, int runTime) {
		super(id, title, nocopies);
		this.runTime = runTime;
	}

	@Override
	public String toString() {
		return "MediaItem [runTime=" + runTime + ", getTitle()=" + getTitle() + ", getNocopies()=" + getNocopies()
				+ ", getId()=" + getId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
