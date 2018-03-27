package pe.edu.tecsup.contactsapp.repositories;

import java.util.ArrayList;
import java.util.List;

import pe.edu.tecsup.contactsapp.models.Person;

/**
 * Created by ebenites on 23/03/2018.
 */

public class PersonRepository {

    private static List<Person> people = new ArrayList<>();

    static{
        people.add(new Person(100, "Juan Salazar", "jsalazar@gmail.com", "jsalazar"));
        people.add( new Person(200, "Miguel Chavez", "mchavez@gmail.com", "mchavez") );
        people.add( new Person(300, "Martha Prado", "mprado@gmail.com", "mprado") );
        people.add( new Person(400, "Jaime Farfan", "jfarfan@gmail.com", "jfarfan") );
        people.add( new Person(500, "Javier Lizarraga", "jlizarraga@gmail.com", "lmaza") );

        people.add(new Person(100, "Juan Salazar", "jsalazar@gmail.com", "jsalazar"));
        people.add( new Person(200, "Miguel Chavez", "mchavez@gmail.com", "mchavez") );
        people.add( new Person(300, "Martha Prado", "mprado@gmail.com", "mprado") );
        people.add( new Person(400, "Jaime Farfan", "jfarfan@gmail.com", "jfarfan") );
        people.add( new Person(500, "Javier Lizarraga", "jlizarraga@gmail.com", "lmaza") );
    }

    public static List<Person> getList(){
        return people;
    }

}
