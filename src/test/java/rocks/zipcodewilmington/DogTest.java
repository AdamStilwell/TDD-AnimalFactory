package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void constructorTest() {
        // Given (dog data)
        String givenName = "Fido";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    // TODO - Create tests for `speak`
    @Test public void speakTest(){
        // Given (cat data)
        Dog dog = new Dog(null, null, null);
        String expected = "bark!";
        String actual = dog.speak();
        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test public void setBirthDateTest(){
        // Given (cat data)
        Dog dog = new Dog(null, null, null);
        Date givenDate = new Date(1920,8,30);
        dog.setBirthDate(givenDate);
        Date actualDate = dog.getBirthDate();
        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenDate, actualDate);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test public void eatFoodTest(){
        // Given (cat data)
        Dog dog = new Dog(null, null, null);
        dog.eat(new Food());
        int givenFood = 1;
        int actualFood = dog.getNumberOfMealsEaten();
        Assert.assertEquals(givenFood, actualFood);
    }


    // TODO - Create tests for `Integer getId()`
    @Test public void getIdTest(){
        // Given (cat data)
        Dog dog = new Dog(null, null, null);
        Integer givenId = 112233;
        dog.setId(givenId);
        Integer actualId = dog.getId();
        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenId, actualId);
    }
    @Test
        public void testInheritance() {
            Animal a = new Dog(null,null,null);
            Assert.assertTrue(a instanceof Animal);
        }
    //    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


        @Test
        public void testImplementation() {
            Mammal m = new Dog(null,null,null);
            Assert.assertTrue(m instanceof Mammal);
        }
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
