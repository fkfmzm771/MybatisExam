package Main;

import java.util.ArrayList;

import DAO.DAOManager;
import VO.Person;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        DAOManager m = new DAOManager();
        ArrayList<Person> pList = m.selectPerson1();



        for (Person person : pList) {
            System.out.println(person.toString());

        }
    }
}
