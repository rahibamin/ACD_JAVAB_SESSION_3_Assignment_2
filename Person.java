package Session3.assignment2;

public class Person {

	private int personAge = 25;
	private int personfavNumber = 17;
	
	
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public int getPersonfavNumber() {
		return personfavNumber;
	}
	public void setPersonfavNumber(int personfavNumber) {
		this.personfavNumber = personfavNumber;
	}
	
	public Person() {	
		
		System.out.println("Person's Age is " + personAge + "  and his fav number is " + personfavNumber);
		
	}
	

}
