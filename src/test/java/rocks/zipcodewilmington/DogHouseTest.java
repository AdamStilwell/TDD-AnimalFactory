package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
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
    public void removeDogByIDTest() {

    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeDogTest(){
        //Given
        DogHouse.add(new Dog("Henry", null, 2));
        //When
        int expected = 0;
        //Then
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogByIdTest(){
        //Given
        DogHouse.add(new Dog("Chip", null, 4));
        //When

        //Then
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void getNumberOfDogsTest(){
        //Given
        DogHouse.add(new Dog(null, null, null));
        DogHouse.add(new Dog(null, null, null));
        //When
        Integer expected = 2;
        //Then
        Integer actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
