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
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void testAddCat() {
        // Given
        String name = "Princess";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);
        int expectedCats = 1;
        int actualCats = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expectedCats, actualCats);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveById() {
        // Given
        String name = "Princess";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        int id = animal.getId();
        CatHouse.add(animal);
        CatHouse.remove(id);
        int expectedCats = 0;
        int actualCats = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expectedCats, actualCats);
    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void testRemoveCat() {
        // Given
        String name = "Princess";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);
        CatHouse.remove(animal);
        int expectedCats = 0;
        int actualCats = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expectedCats, actualCats);
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getDogByIdTest(){
        // Given (some
        String name = "Princess";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        DogHouse.clear();

        // When
        CatHouse.add(animal);
        int id = animal.getId();
        Cat expectedId = animal;
        Cat actualId = CatHouse.getCatById(id);

        // Then
        Assert.assertEquals(expectedId,actualId);
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testGetNumberOfCats() {
        // Given
        String name = "Princess";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);
        int expectedCats = 1;
        int actualCats = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expectedCats, actualCats);
    }
}
