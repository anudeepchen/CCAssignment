/**
 * Below program implements Animal Shelter where we can add specific animal to the shelter and
 * remove animals from shelter. 
 * Implemented deQueue , enQueue methods using LinkedList data structure.
 * 
 */
import java.util.LinkedList;

public class Solution06 {

	LinkedList<Dog> dogs = new LinkedList<Dog>();
	LinkedList<Cat> cats = new LinkedList<Cat>();
	int time = 0;

	public void enqueue(Animal a) {
		a.timeStamp = ++time;
		if (a instanceof Dog)
			dogs.addLast((Dog) a);
		else if (a instanceof Cat)
			cats.addLast((Cat) a);
	}

	public Animal dequeueAny() {
		if (dogs.isEmpty()) {
			return cats.removeFirst();
		} else if (cats.isEmpty()) {
			return dogs.removeFirst();
		} else {
			Dog d = dogs.peek();
			Cat c = cats.peek();

			if (d.timeStamp < c.timeStamp)
				return dogs.removeFirst();
			else
				return cats.removeFirst();
		}
	}

	public Dog dequeueDog() {
		return dogs.removeFirst();
	}

	public Cat dequeueCat() {
		return cats.removeFirst();
	}

	public static void main(String[] args) {
		
		Solution06 a = new Solution06();
		
		a.enqueue(new Dog("tom"));
		a.enqueue(new Cat("cat"));
		a.enqueue(new Dog("dude"));
		a.enqueue(new Cat("billi"));
		a.enqueue(new Dog("kutthe"));
		
		System.out.println(a.dequeueCat().name);
	}

}

class Animal {

	public String name;
	public int timeStamp;

	public Animal(String s) {
		name = s;
	}
}
class Dog extends Animal {
	public Dog(String s) {
		super(s);
	}
}

class Cat extends Animal {
	public Cat(String s) {
		super(s);
	}
}
