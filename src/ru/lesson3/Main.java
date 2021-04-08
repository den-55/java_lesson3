package ru.lesson3;

import ru.lesson3.entity.Animal;
import ru.lesson3.entity.Cat;
import ru.lesson3.entity.Dog;
import ru.lesson3.enums.Gender;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Vasyan", 1, Gender.UNKNOW);
        Dog dog1 = new Dog("Vasyan", 1, Gender.UNKNOW);
        Dog dog2 = new Dog("Vasyan", 1, Gender.UNKNOW);
        Dog dog3 = new Dog("Vasyan", 1, Gender.UNKNOW);
        Cat cat = new Cat("Milka");
        Cat cat1 = new Cat("Milka");
        Cat cat2 = new Cat("Milka");
        Cat cat3 = new Cat("Milka");

        List<Animal> animalActionList = new ArrayList<>();
        animalActionList.add(dog);
        animalActionList.add(dog1);
        animalActionList.add(dog2);
        animalActionList.add(dog3);
        animalActionList.add(cat);
        animalActionList.add(cat1);
        animalActionList.add(cat2);
        animalActionList.add(cat3);

        for(AnimalActions actions: animalActionList) {
            actions.say("Opa");
        }


    }
}
