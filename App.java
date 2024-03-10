package ru.anna.RestApiConsumer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.anna.RestApiConsumer.entity.Item;
import ru.anna.RestApiConsumer.entity.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().addAnnotatedClass(Person.class).addAnnotatedClass(Item.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();

//            Person person = session.get(Person.class,3); //получаем через человека все его вещи
//            System.out.println(person);
//            List<Item> items = person.getItems();
//            System.out.println(items);

//            Item item = session.get(Item.class,2); // получаем через вещь человека
//            System.out.println(item);
//            Person person = item.getPerson();
//            System.out.println(person);

//            Person person = session.get(Person.class,2); // добавляем новую вещь человеку
//            Item newItem = new Item("Item FRom HIber",person);
//            person.getItems().add(newItem); //двустороннее соотношение - хороший тон
//            session.save(newItem);

//            Person person = new Person("Tomas",22); //добавляем человека и к нему вещь
//            Item newItem = new Item("Item from Hib2",person); //связь
//            person.getItems(new ArrayList<Item>(Collections.singletonList(newItem))); //связь
//            session.save(person);
//            session.save(newItem);

//            Person person = session.get(Person.class,3); //удаление всех вещей у человека
//            List<Item> items = person.getItems();
//
//            for (Item item: items) {
//                session.remove(item);
//            }
//            person.getItems().clear();

//            Person person = session.get(Person.class,2); //удаление человека
//            session.remove(person);
//            person.getItems().forEach(item -> item.setPerson(null));

//            Person person = session.get(Person.class,4); //меняем владельца товара
//            Item item = session.get(Item.class,1);
//            item.setPerson(person);
//            person.getItems().add(item);

            session.getTransaction().commit();

        } finally {
            sessionFactory.close();
        }
    }
}
