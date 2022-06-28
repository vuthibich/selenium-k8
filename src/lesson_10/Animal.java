
package lesson_10;

import java.security.SecureRandom;


public abstract class Animal {
    private int speed;
    private String name;
    private int randomSpeed;

    public Animal(){
        
    }
    public Animal(String name) {
        this.name = name;
        
    }

    public int getRandomSpeed() {
		return randomSpeed;
	}
	public void setRandomSpeed(int randomSpeed) {
		this.randomSpeed = randomSpeed;
	}
	public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract int Speed();
}
