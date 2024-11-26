package ie.atu.week11example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final PersonRepository personRepository;

    @Autowired
    public DataLoader (PersonRepository personRepository){
        this.personRepository = personRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        //test data
        Person testData = new Person(1L, "Paul", 23, "paul@atu.ie", "Mr", "12345", "Lecturer", "Electronics");
        Person testData2 = new Person(2L, "Joe", 32, "joe@atu.ie", "Mr", "54321", "Lecturer", "Electronics");
        Person testData3 = new Person(3L, "Tina", 20, "tina@atu.ie", "Ms", "54541", "Lecturer", "Electronics");
        personRepository.save(testData);
        personRepository.save(testData2);
        personRepository.save(testData3);
    }
}
