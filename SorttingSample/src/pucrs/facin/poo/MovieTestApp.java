package pucrs.facin.poo;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MovieTestApp {

	public static void main(String[] args) {
		List<Movie> filmes = new ArrayList<>();
		
		filmes.add(new Movie("The Shawshank Redemption",1994,"Drama",9.3));
		filmes.add(new Movie("The Godfather",1972,"Fantasy",9.2));
		filmes.add(new Movie("Pulp Fiction",1994,"Thriller",8.9));
		filmes.add(new Movie("The Dark Knight",2008,"Action",9));
		filmes.add(new Movie("The Lord of the Rings: The Return of the King",2003,"Action",8.9));
		filmes.add(new Movie("Star Wars",1977,"Action",8.7));
		filmes.add(new Movie("The Matrix",1999,"Sci-Fi",8.7));
		filmes.add(new Movie("Monty Python and the Holy Grail",1975,"Comedy",8.3));
		filmes.add(new Movie("2001: A Space Odyssey",1968,"Sci-Fi",8.3));
		filmes.add(new Movie("The Empire Strikes Back",1980,"Sci-Fi",8.8));
		filmes.add(new Movie("Tomorrow Never Dies",1998,"Action",6.5));
		filmes.add(new Movie("Skyfall",2012,"Action",7.8));
		filmes.add(new Movie("Casino Royale",2006,"Action",8));
		

		Collections.sort(filmes);
		System.out.println("\nfilmes ordenados pelo nome (Comparable)");
		for(Movie m : filmes) {
			System.out.printf("%d \t %.1f \t %10s \t %s\n", m.getYear(), m.getRating(), m.getGenre(), m.getTitle() );
		}


		Collections.sort(filmes, new ComparadorAno());
		System.out.println("\nfilmes ordenados pelo ano (Comparator)");
		for(Movie m : filmes) {
			System.out.printf("%d \t %.1f \t %10s \t %s\n", m.getYear(), m.getRating(), m.getGenre(), m.getTitle() );
		}
		
		Collections.sort(filmes, Movie.getComparadorGenero());
		System.out.println("\nfilmes ordenados pelo ano (Comparator, anonima)");
		for(Movie m : filmes) {
			System.out.printf("%d \t %.1f \t %10s \t %s\n", m.getYear(), m.getRating(), m.getGenre(), m.getTitle() );
		}

		System.out.println("\nJava 8... rating (lambda)");
		filmes.sort( (m1,m2) -> Double.compare(m1.getRating(), m2.getRating()));
		
		for(Movie m : filmes) {
			System.out.printf("%d \t %.1f \t %10s \t %s\n", m.getYear(), m.getRating(), m.getGenre(), m.getTitle() );
		}
		
		System.out.println("\nJava 8... genero (comparator)");
		filmes.sort( Comparator.comparing(m -> m.getGenre()));
		
		for(Movie m : filmes) {
			System.out.printf("%d \t %.1f \t %10s \t %s\n", m.getYear(), m.getRating(), m.getGenre(), m.getTitle() );
		}
		
		
		System.out.println("\nJava 8... rating decrescente(comparator)");
		filmes.sort( Comparator.comparing((Movie m) -> m.getRating()).reversed());
		
		for(Movie m : filmes) {
			System.out.printf("%d \t %.1f \t %10s \t %s\n", m.getYear(), m.getRating(), m.getGenre(), m.getTitle() );
		}
		
		System.out.println("\nJava 8... genero + rating decrescente(comparator)");
		filmes.sort( Comparator.comparing((Movie m) -> m.getGenre()).thenComparingDouble(Movie::getRating));
		
		for(Movie m : filmes) {
			System.out.printf("%d \t %.1f \t %10s \t %s\n", m.getYear(), m.getRating(), m.getGenre(), m.getTitle() );
		}
	}

}
