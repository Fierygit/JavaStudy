package JDBC.service;

import JDBC.dao.PersonDAO;
import JDBC.dao.UserDAO;
import JDBC.dto.Person;
import JDBC.dto.User;


import java.sql.Connection;
import java.util.List;

/**
 * @author Firefly
 * @version 1.0
 * @date 2019/10/22 8:36
 */

public class PersonService {
    Connection connection;
    PersonDAO personDAO;
    UserDAO userDAO;

    public PersonService(Connection connection){
        this.connection = connection;
        personDAO = new PersonDAO(connection);
        userDAO = new UserDAO(connection);
    }


    public List<Person> getAll() {
        return personDAO.getAll();
    }

    public boolean addPerson(Person person) {
        if (!userDAO.queryByName(person.getUsername())){
            User user = new User(person.getUsername(), "8888888");
            userDAO.addUser(user);
        }
        if(personDAO.queryByName(person)){
            personDAO.updateOne(person);
        }else {
            personDAO.addOnePerson(person);
        }
        return true;
    }

    public void close() {
        userDAO.close();
        personDAO.close();
    }

}
