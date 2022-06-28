
package lesson_07_2;

import java.util.ArrayList;
import java.util.List;


public class lab7_2 {

    public static void main(String[] args) {
        Animal hosrse = new Horse("horse");
        Animal tiger = new Tiger("tiger");
        Animal dog = new Dog("dog");
        List<Animal> listAnimal = new ArrayList<>();
        listAnimal.add(hosrse);
        listAnimal.add(tiger);
        listAnimal.add(dog);
        
        Animal champion =  Champion(listAnimal);
        System.out.println("Winner is "+champion.getName()+", with speed: "+champion.Speed());
        
    }
    public static Animal Champion(List<Animal> listAnimal){
        Animal champion = new Animal();
        if(listAnimal.size()> 0){
            champion = listAnimal.get(0);
            for (int i = 0; i < listAnimal.size(); i++) {
                if(listAnimal.get(i).Speed() > champion.Speed()){
                    champion = listAnimal.get(i);
                }
            }
        }
        return champion;
    }

}
