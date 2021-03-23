package observer;

public class ObserverMain {

	public static void main(String[] args) {
			
		Instructor instructor = new Instructor();
		Observer obs1 = new Client("Customer 1");
		Observer obs2 = new Client("Customer 2");
		Observer obs3 = new Client("Customer 3");
		
		instructor.subscribe(obs1);
		instructor.subscribe(obs2);
		instructor.subscribe(obs3);
		
		instructor.setInstructor("New exercise was set");

	}

}
