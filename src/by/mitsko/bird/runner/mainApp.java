package by.mitsko.bird.runner;

import by.mitsko.bird.model.Bird;
import by.mitsko.bird.model.Student;

public class mainApp {
	public static void main(String[] args) {
		Bird bd = new Bird ("Polar owl", "white");
		Student st = new Student("Ivan Petrov");
		
		st.informAboutBird (bd);
		bd.Fly();
		bd.Mouse (5);
		bd.Attack();
		st.BirdFeeding(bd);
		st.ReturnToTheNest();
	}
}
