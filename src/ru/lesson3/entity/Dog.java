package ru.lesson3.entity;

import ru.lesson3.enums.Gender;

/**
 * class Dog
 * описание объекта собаки
 *
 * @return
 * @date 08.04.2021
 * @author DEnis
 */

public class Dog {
    private String name;
    private Integer age;
    private Gender gender;

    public Dog(String name, Integer age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
 }
