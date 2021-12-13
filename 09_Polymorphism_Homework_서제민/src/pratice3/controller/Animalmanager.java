package pratice3.controller;

import pratice3.model.vo.Animal;
import pratice3.model.vo.Cat;
import pratice3.model.vo.Dog;

public class Animalmanager {

	public static void main(String[] args) {
		
    Animal[] ani = new Animal[5];
    
    ani[0] = new Dog();
    ani[1] = new Cat();
    ani[2] = new Dog();
    ani[3] = new Dog();
    ani[4] = new Cat();
    
    for(int i = 0; i < ani.length; i++) {
    	if(ani[i] instanceof Dog){
    		ani[i].speak();
    	}else {
    		ani[i].speak();
    	}
    }
	}

}
