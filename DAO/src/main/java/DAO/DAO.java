package DAO;

import Entity.Person;

public interface DAO {
    public void create(Person person);
    public Person find(int id);
    public Boolean update(Person person);
    public Boolean delete(int id);
}
