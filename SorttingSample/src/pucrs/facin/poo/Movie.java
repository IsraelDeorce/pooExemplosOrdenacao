package pucrs.facin.poo;

import java.util.Comparator;

public class Movie implements Comparable<Movie>{
	private String title;
	private int year;
	private double rating;
	private String genre;
	
	public Movie(String aTitle, int aYear, String aGenre, double aRating){
		this.title = aTitle;
		this.year = aYear;
		this.rating = aRating;
		this.genre = aGenre;
	}
				
	public String getTitle() { return title; }
	public int getYear() { return year; }
	public String getGenre() { return genre; }
	public double getRating() { return rating; }

	@Override
	public int compareTo(Movie other) {
		return this.title.compareTo(other.title);
	}

	public static Comparator<Movie> getComparadorGenero() {
		
		return new Comparator<Movie>() {

			@Override
			public int compare(Movie o1, Movie o2) {
				return o1.getGenre().compareTo(o2.getGenre());
			} 
		};
	}

}
