package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void testCreateDog() {
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        //When
        Dog animal = AnimalFactory.createDog(name, birthDate);

        // Then
        Assert.assertTrue(animal !=null);

    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void testCreateCat() {
        // Given
        String name = "Princess";
        Date birthDate = new Date();
        
        // When
        Cat animal = AnimalFactory.createCat(name, birthDate);

        // Then
        Assert.assertTrue(animal !=null);

    }
}
