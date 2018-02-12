package by.mitsko.bird.model;

public class Bird {
	public String name;
	public String color;
	public Mouse[] mouse;
	public int mouseCount;
	public int result;
	public int count = 0;

	public Bird(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public void Fly() {
		System.out.println("The owl is flying");
	}

	public void Mouse(int mouseCount) {
		if (mouseCount > 0) {
			mouse = new Mouse[mouseCount];
			for (int i = 0; i < this.mouse.length; i++) {
				mouse[i] = new Mouse();
			}
			System.out.println();
		}
	}

	public void Attack() {
		for (int i = 0; i < this.mouse.length; i++) {
			System.out.println("The owl is attacking");
			int result;
			result = (int) (Math.random() * 2);
			switch (result) {
			case 1:
				count = count + 1;
				System.out.println("The owl caught the mouse and ate");
				break;
			case 0:
				System.out.println("The owl continuing the hunting");
				break;
			}

		}

	}

}
