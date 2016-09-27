import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ScoreTrekker {

	private String file = "scores.txt";
	//private String[] files = {"scores.txt", "badscore.txt", "nofile.txt"};
	
	private ArrayList<Student> students = new ArrayList<Student>();

	
	private void loadDataFromFile(String fileName) throws FileNotFoundException
	{
		FileReader reader = new FileReader(fileName);
		Scanner in = new Scanner(reader);
		
		while(in.hasNextLine())
		{
			String name = in.nextLine();
			String s = in.nextLine();
			int score = 0;
			
			try
			{
				score = Integer.parseInt(s);
			}
			catch (NumberFormatException e)
			{
				System.out.println("Incorrect format for " + name + " not a valid score: "
						+ s);
				
				continue;
			}
			
			students.add(new Student(name, score));
		}
		
	}
	
	private void printInOrder()
	{
		for(Student student : students)
		{
			System.out.println(student);
		}
	}
	
	private void processFiles() throws FileNotFoundException
	{
		loadDataFromFile(file);
		printInOrder();
	}
	
	public static void main(String args[]) throws FileNotFoundException
	{
		ScoreTrekker scoretrekker = new ScoreTrekker();
		scoretrekker.processFiles();
	}
}
