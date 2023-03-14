package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test public void setNameTest(){
        // Given (cat data)
        Cat cat = new Cat(null, null, null);
        String givenName = "Sunny";
        cat.setName(givenName);
        String actualName = cat.getName();
        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, actualName);
    }
    // TODO - Create tests for `speak`
    @Test public void speakTest(){
        // Given (cat data)
        Cat cat = new Cat(null, null, null);
        String expected = "meow!";
        String actual = cat.speak();
        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test public void setBirthDateTest(){
        // Given (cat data)
        Cat cat = new Cat(null, null, null);
        Date givenDate = new Date(1920,8,30);
        cat.setBirthDate(givenDate);
        Date actualDate = cat.getBirthDate();
        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenDate, actualDate);
    }
     //TODO - Create tests for `void eat(Food food)`
    @Test public void eatFoodTest(){
        // Given (cat data)
        Cat cat = new Cat(null, null, null);
        cat.eat(new Food());
        int givenFood = 1;
        int actualFood = cat.getNumberOfMealsEaten();
        Assert.assertEquals(givenFood, actualFood);
    }
    // TODO - Create tests for `Integer getId()`
    @Test public void getIdTest(){
        // Given (cat data)
        Cat cat = new Cat(null, null, null);
        Integer givenId = 112233;
        cat.setId(givenId);
        Integer actualId = cat.getId();
        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenId, actualId);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testInheritance() {
        Animal a = new Cat(null,null,null);
        Assert.assertTrue(a instanceof Animal);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void testImplementation() {
        Mammal m = new Cat(null,null,null);
        Assert.assertTrue(m instanceof Mammal);
    }


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
