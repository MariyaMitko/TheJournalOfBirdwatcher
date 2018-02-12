package by.mitsko.bird.model;

public class Student {
	public String name;
	public int count;

	public Student(String name) {
		this.name = name;
	}

	public  void informAboutBird(Bird Bird) {
		if (Bird != null) {
			System.out.println("========Journal of the birdwatcher=========");
			System.out.println("Student: " + this.name);
			System.out.println("Bird name: " + Bird.name);
			System.out.println("Bird color: " + Bird.color);
		}
	}

	public  void BirdFeeding(Bird Bird) {
		System.out.println();
		System.out.println("Owl ate " + Bird.count + " mice");
	}

	public  void ReturnToTheNest() {
		System.out.println();
		System.out.println("Owl return to the nest");

	}
}