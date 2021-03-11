package com.cg.lb4.ui;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import com.cg.lb4.model.Book;
import com.cg.lb4.model.Cd;
import com.cg.lb4.model.JournalPaper;
import com.cg.lb4.model.Video;


public class Main3 {


	public static void main(String[] args) {
		

		Book book=new Book(01, "Java", 10, "capgemini");
		JournalPaper journal=new JournalPaper(02, "journal", 2, "Dr Manjunath",LocalDate.of(2015, Month.JANUARY, 10)); 
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");
		String date = "23-Mar-2019";
		JournalPaper journal1=new JournalPaper(03, "new journal", 4, "Dr SomeOne",LocalDate.parse(date, formatter)); 
		
		Cd audio = new Cd(06, "audio", 23, 1, "iit", "new");
		Video javaAdvanced = new Video(02, "advanced JAVA", 25, 4, "ramanath", "new", LocalDate.of(2020, Month.FEBRUARY, 10));
		System.out.println(book);
		System.out.println(journal);
		System.out.println(journal1);
		System.out.println(javaAdvanced);
		System.out.println(audio);
	}

}
