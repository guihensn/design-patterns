package Entity;

import java.text.MessageFormat;

public class Person{
    public int id;
    public String name;
    public int age;
    public float height;
    public float weight;

    public Person(int id, String name, int age, float height, float weight) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Person(){ }

    @Override
    public String toString(){
        return MessageFormat.format("ID:{0} \n Name:{1} \n Age:{2} \n Height:{3} \n Weight:{4} \n",id,name,age,height,weight);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
