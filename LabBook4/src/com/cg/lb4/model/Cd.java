package com.cg.lb4.model;
public class Cd extends MediaItem{
	
	String artist;
	String genere;
	
	public Cd(Integer id, String title, Integer nocopies, int runTime) {
		super(id, title, nocopies, runTime);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param title
	 * @param nocopies
	 * @param runTime
	 * @param artist
	 * @param genere
	 */
	public Cd(Integer id, String title, Integer nocopies, int runTime, String artist, String genere) {
		super(id, title, nocopies, runTime);
		this.artist = artist;
		this.genere = genere;
	}

	@Override
	public String toString() {
		return "Cd [artist=" + artist + ", genere=" + genere + "]";
	}
	
	

}
