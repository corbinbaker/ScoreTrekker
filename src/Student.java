
public class Student implements Comparable<Student> {

	private String name = " ";
	private int score = 0;
	
	public Student (String inputName, int inputScore)
	{
		name = inputName;
		score = inputScore;
	}
	
	@Override
	public int compareTo(Student input) 
	{
		return this.score - input.score;
	}

	@Override
	public String toString() 
	{
		return name + " " + score;
	}
	
	
}
