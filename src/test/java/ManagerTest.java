import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @Test
    public void test(){
        Manager manager = new Manager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");


        String[] expected = { "Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6" };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testF(){
        Manager manager = new Manager();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");


        String[] expected = { "Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
