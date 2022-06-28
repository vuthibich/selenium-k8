
package lesson_10;

import java.security.SecureRandom;

public class Horse extends Animal{

    public Horse(String name) {
        super(name);
    }
	@Override
	public int Speed() {
		this.setSpeed(75);
		this.setRandomSpeed(new SecureRandom().nextInt(this.getSpeed()));
		return  this.getRandomSpeed();
	}
    
}
