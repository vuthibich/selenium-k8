
package lesson_10;

import java.security.SecureRandom;

public class Tiger extends Animal{

    public Tiger(String name) {
        super(name);
    }
	@Override
	public int Speed() {
		this.setSpeed(100);
		this.setRandomSpeed(new SecureRandom().nextInt(this.getSpeed()));
		return  this.getRandomSpeed();
	}
}
