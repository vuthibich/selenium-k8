
package lesson_07_2;

import java.security.SecureRandom;


public class Animal {
    private int speed;
    private String name;
    private int randomSpeed;

    public Animal(){
        
    }
    public Animal(int speed,String name) {
        this.speed = speed;
        this.name = name;
        randomSpeed= new SecureRandom().nextInt(this.speed);
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
    public int Speed(){
         
        return randomSpeed;
    }
}
