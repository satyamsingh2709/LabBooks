package com.cg.lb4.model;
import java.time.LocalDate;
public class Video extends MediaItem {

	String director;
	String genere;
	private LocalDate yearReleased ;
	
	
	public Video(Integer id, String title, Integer nocopies, int runTime) {
		super(id, title, nocopies, runTime);
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param id
	 * @param title
	 * @param nocopies
	 * @param runTime
	 * @param director
	 * @param genere
	 * @param yearReleased
	 */
	public Video(Integer id, String title, Integer nocopies, int runTime, String director, String genere,
			LocalDate yearReleased) {
		super(id, title, nocopies, runTime);
		this.director = director;
		this.genere = genere;
		this.yearReleased = yearReleased;
	}
}