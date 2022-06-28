package lesson_09;

import java.security.SecureRandom;

public class Animal {

	private String name ;
	private int speed ;
	private boolean flyable;
	protected Animal(Builder builder) {
		this.name = builder.name;
		this.speed = new SecureRandom().nextInt(builder.speed);
		this.flyable = builder.flyable;
	}
	public String getName() {
		return name;
	}
	public int getSpeed() {
		return speed;
	}
	public boolean isFlyable() {
		return flyable;
	}
	
	public static class Builder {
		private String name ;
		private int speed;
		private boolean flyable;
		
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		public Builder setSpeed(int speed) {
			this.speed = speed;
			return this;
		}
		public Builder setFlyable(boolean flyable) {
			this.flyable = flyable;
			return this;
		}
		
		public Animal build() {
			return new Animal(this);
		}
		
	}
	
}
