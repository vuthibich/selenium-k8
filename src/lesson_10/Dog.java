
package lesson_10;

import java.security.SecureRandom;

public class Dog extends Animal {

	
    public Dog(String name) {
        super(name);
    }

	@Override
	public int Speed() {
		this.setSpeed(60);
		this.setRandomSpeed(new SecureRandom().nextInt(this.getSpeed()));
		return  this.getRandomSpeed();
	}
    
}
