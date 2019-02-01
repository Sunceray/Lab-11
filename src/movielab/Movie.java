package movielab; //allows different class to interact with one another  
 
import java.util.ArrayList;
import java.util.Scanner;

public class Movie {	
	
	private String title;//instance field variables (uniquely variables)
	private String category;//instance field variables (uniquely variables)
	
	public Movie() {

	}

	public Movie(String title, String category) {
		this.title = title;
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	
	
	
	
	
	
	

}
