package ex6.person;

import ex6.fruit.Fruit;

public class Person {
    private Fruit fruit;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    public void eatFruit(){
        System.out.println(name+fruit.eat());
    }
}
