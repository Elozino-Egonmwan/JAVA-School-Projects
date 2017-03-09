
package at.jku.student.softwareTech;
import java.util.Random;

public class Fish extends Animal{
	
	Random r = new Random ();
	private int maxAge = 5;
	private int age = r.nextInt(maxAge+1);		
	private int birthRate = 7;
	
	public Fish (int ages){
		setAge(ages);
	}
	
	public void setAge(int ages){
		if (ages <= maxAge){
			age = ages;
		} else{
			System.out.println(ages + " is higher than maximum age of an Otter, hence it has been reset to " + age);			
		}		
	}
	
	public int getAge (){
		return age;
	}
	
	public int maxAge(){
		return maxAge;
	}
	
	public int getBirthRate(){
		return birthRate;
	}
	
	public String toString(){
		if(super.getSex().equals("female"))
			return "f";
		else
			return "F";
	}	
}