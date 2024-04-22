package tests;

import org.junit.jupiter.api.*;
import animals.AnimalType;
import animals.petstore.pet.attributes.Breed;
import animals.petstore.pet.attributes.Gender;
import animals.petstore.pet.attributes.Skin;
import animals.petstore.pet.types.Bird;

import static org.junit.jupiter.api.Assertions.assertEquals;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BirdTests {

    private static Bird actualBird;
    @BeforeAll
    public static void createAnimals()
    {
        actualBird = new Bird(AnimalType.DOMESTIC, Skin.FEATHERS, Gender.UNKNOWN, Breed.UNKNOWN);
    }


    @Test
    @Order(1)
    @DisplayName("Animal Test Type Tests Domestic")
    public void animalTypeTests()
    {
        assertEquals(AnimalType.DOMESTIC, actualBird.getAnimalType(), "Animal Type Expected[" + AnimalType.DOMESTIC
                + "] Actual[" + actualBird.getAnimalType() + "]");
    }

    @Test
    @Order(1)
    @DisplayName("Bird Speak Chirp Tests")
    public void birdGoesWoffTest()
    {
        assertEquals("The bird goes flap! flap!", actualBird.speak(), "I was expecting flap! flap!");
    }

    @Test
    @Order(1)
    @DisplayName("Bird Fur is it Hyperallergetic")
    public void birdHyperAllergeticTests()
    {
        assertEquals("The bird is not hyperallergetic!", actualBird.birdHypoallergenic(),
                "The bird is not hyperallergetic!");
    }

    @Test
    @Order(1)
    @DisplayName("Bird has legs Test")
    public void legTests()
    {
        Assertions.assertNotNull(actualBird.getNumberOfLegs());
    }

    @Test
    @Order(2)
    @DisplayName("Bird Gender Test Male")
    public void genderTestMale()
    {
        actualBird = new Bird(AnimalType.WILD, Skin.UNKNOWN,Gender.MALE, Breed.UNKNOWN);
        assertEquals(Gender.MALE, actualBird.getGender(), "Expecting Male Gender!");
    }

    @Test
    @Order(2)
    @DisplayName("Bird Breed Test Blue Jay")
    public void genderBirdBreed() {
        actualBird = new Bird(AnimalType.WILD, Skin.UNKNOWN,Gender.FEMALE, Breed.BLUE_JAY);
        assertEquals(Breed.BLUE_JAY, actualBird.getBreed(), "Expecting Breed Blue Jay!");
    }

    @Test
    @Order(2)
    @DisplayName("Bird Speak ka-ka Tests")
    public void birdGoesKakaTest()
    {
        actualBird = new Bird(AnimalType.WILD, Skin.UNKNOWN,Gender.UNKNOWN, Breed.UNKNOWN);
        assertEquals("The bird goes ka-ka! ka-ka!", actualBird.speak(), "I was expecting ka-ka");
    }

    @Test
    @Order(2)
    @DisplayName("Bird Speak Chirp")
    public void birdGoesChirpTest()
    {
        actualBird = new Bird(AnimalType.UNKNOWN, Skin.UNKNOWN,Gender.UNKNOWN, Breed.UNKNOWN);
        assertEquals("The bird goes Chirp! Chirp!", actualBird.speak(), "I was expecting Chirp");
    }

    // Added to improve test coverage
    @Test
    @Order(3)
    @DisplayName("Bird Has 2-legs Test")
    public void birdLegsTest()
    {
        actualBird = new Bird(AnimalType.WILD, Skin.FEATHERS, Gender.UNKNOWN, Breed.CARDINAL);
        assertEquals("Birds have 2 legs!", actualBird.numberOfLegs(), "I was expecting 2 legs");
    }
}
