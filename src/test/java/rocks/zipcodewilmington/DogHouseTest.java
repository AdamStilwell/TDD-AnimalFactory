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
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addDogTest() {
        //Given
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        //When
        DogHouse.add(animal);
        //Then
        int expected = 1;
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveById() {
        // Given
        String name = "Fido";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        int id = animal.getId();
        DogHouse.add(animal);
        DogHouse.remove(id);
        int expectedDogs = 0;
        int actualDogs = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(expectedDogs, actualDogs);
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeDogTest(){
        // Given
        String name = "Fido";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);
        DogHouse.remove(animal);
        int expectedDogs = 0;
        int actualDogs = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(expectedDogs, actualDogs);
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogByIdTest(){
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);
        int id = animal.getId();
        Dog expectedId = animal;
        Dog actualId = DogHouse.getDogById(id);

        // Then
        Assert.assertEquals(expectedId,actualId);
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void getNumberOfDogsTest(){
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);
        int expectedDogs = 1;
        int actualDogs = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(expectedDogs,actualDogs);

    }
}
