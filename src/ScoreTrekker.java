import java.util.ArrayList;
import java.util.Scanner;

public class ScoreTrekker {

	private String file = "score.txt";
	//private String[] files = {"scores.txt", "badscore.txt", "nofile.txt"};
	
	private ArrayList<Student> students = new ArrayList<Student>();

	
	private void loadDataFromFile(String fileName)
	{
		
	}
	
	private void printInOrder()
	{
		Student[] sarray = (Student[]) students.toArray();
		for(Student student : sarray)
		{
			System.out.println(student);
		}
	}
	
	private void processFiles()
	{
		loadDataFromFile(file);
		printInOrder();
	}
	
	public static void main(String args[])
	{
		ScoreTrekker scoretrekker = new ScoreTrekker();
		scoretrekker.processFiles();
	}
}
