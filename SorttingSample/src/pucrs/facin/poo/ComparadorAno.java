package pucrs.facin.poo;

import java.util.Comparator;

public class ComparadorAno implements Comparator<Movie>{

	@Override
	public int compare(Movie arg0, Movie arg1) {
		return arg0.getYear() - arg1.getYear();
	}

}
