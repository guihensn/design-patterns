import DAO.DAOImpl;
import Persistence.Database;
import Entity.Person;

public class DAOTest {
    public static void main(String args[]){
        Database databaseConection = Database.getInstance();
        DAOImpl dao = new DAOImpl(databaseConection);

        Person person1 = new Person(10,"Woo",40, 1.2f,30f);
        Person person2 = new Person(1,"Flavina",40, 1.2f,30f);

        Person result = dao.find(5);
        System.out.println(result);

        dao.create(person1);
        result = dao.find(10);
        System.out.println(result);

        dao.delete(5);
        result = dao.find(5);
        System.out.println(result);

        dao.update(person2);
        result = dao.find(1);
        System.out.println(result);
    }
}
