package DAO;

import Persistence.Database;
import Entity.Person;

public class DAOImpl implements DAO {
    public Database databaseConection;

    public DAOImpl(Database databaseConection){
        this.databaseConection = databaseConection;
    }
    @Override
    public void create(Person newPerson) {
        this.databaseConection.getPeople().add(newPerson);
    }

    public Person find(int id) {
        Person result = null;

        for(Person person:  this.databaseConection.getPeople()) {
            if (person.id == id) {
                result = person;
            }
        }

        return result;
    }

    @Override
    public Boolean update(Person newPerson) {
        Boolean sucess = false;
        delete(newPerson.id);
        create(newPerson);
        return sucess;
    }

    @Override
    public Boolean delete(int id) {
        Boolean sucess = false;
        Person personToRemove = this.find(id);

        if(personToRemove != null){
            this.databaseConection.getPeople().remove(personToRemove);
            sucess = true;
        }

        return  sucess;
    }
}
