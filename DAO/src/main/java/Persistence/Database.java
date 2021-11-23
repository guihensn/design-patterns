package Persistence;

import Entity.Person;
import java.util.ArrayList;

public class Database {
    private static Database database;
    private static ArrayList<Person> people = new ArrayList<>();

    private Database(){
        people.add(new Person(1,"Peter",10,1.3f,30f));
        people.add(new Person(2,"Ana",58,1.6f,70f));
        people.add(new Person(3,"Mary",1,0.3f,10f));
        people.add(new Person(4,"Lua",52,1.7f,60f));
        people.add(new Person(5,"Paul",7,1.0f,40f));
        people.add(new Person(6,"Iguana",17,2.0f,60f));
        people.add(new Person(7,"Willian",40,1.7f,70f));
        people.add(new Person(8,"Catarina",38,2.3f,60f));
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public static Database getInstance(){
        if(database == null){
            database = new Database();
        }
        return database;
    }
}
