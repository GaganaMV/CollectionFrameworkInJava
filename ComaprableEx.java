package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie{
	int year;
	String mname,mprice;
	public Movie(int year, String mname, String mprice) {
		super();
		this.year = year;
		this.mname = mname;
		this.mprice = mprice;
	}
	@Override
	public String toString() {
		return "Movie [year=" + year + ", mname=" + mname + ", mprice=" + mprice + "]";
	}
		
}
class SortByyear implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return o1.year-o2.year;
	}
	
}
class SortBymname implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return o1.mname.compareTo(o2.mname);
	}
	
}

public class ComaprableEx {

	public static void main(String[] args) {
		ArrayList<Movie> aa= new ArrayList<>();
		aa.add(new Movie(2000, "RRR", "rehg"));
		aa.add(new Movie(200, "gfchgv", "jg"));
		Collections.sort(aa,new SortBymname());
		for(int i=0;i<aa.size();i++) {
			System.out.println(aa.get(i));
		}

	}

}
