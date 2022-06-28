package lesson_09;

import java.util.ArrayList;
import java.util.List;


public class Lab9 {
	
	
	public static void main( String[] args) {
		
		Animal tiger = new Animal.Builder().setFlyable(false).setName("tiger").setSpeed(100).build();
		Animal falcon = new Animal.Builder().setFlyable(true).setName("falcon").setSpeed(60).build();
		Animal dog = new Animal.Builder().setFlyable(false).setName("dog").setSpeed(40).build();
	    List<Animal> listAnimal = new ArrayList<>();
        listAnimal.add(falcon);
        listAnimal.add(tiger);
        listAnimal.add(dog);
        
          Champion(listAnimal);
 
	}
	
	  public static void Champion(List<Animal> listAnimal){
	        
	        if(listAnimal.size()> 0){
	        	String nameChampion = "";
	        	int speedChampion = 0;
	            for (int i = 0; i < listAnimal.size(); i++) {
	            	if(listAnimal.get(i).isFlyable() == false) {
	                    if(listAnimal.get(i).getSpeed() > speedChampion){
		                 	 nameChampion = listAnimal.get(i).getName();
		    	        	 speedChampion = listAnimal.get(i).getSpeed();
		                }
	            	}	    
	            }
	            System.out.println("Winner is "+nameChampion+", with speed: "+speedChampion);
	        }
	        
	    }
	

}
