import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

// I am testing the Dog class - Therefore, these are unit tests
// I am only concerned with implementation details of Dog ONLY
public class DogTest {

    @Spy
    AnimalNamer animalNamerSpy = new AnimalNamer();

    Dog dog;
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        Mockito.doReturn("dog").when(animalNamerSpy).getName(any());

//        when(animalNamerMock.getName(any())).thenReturn("FIDO");
        dog = new Dog(animalNamerSpy);
    }

//    Bark method needs to return a "BARK" string
    @Test
    public void testBark() {
        assertNotNull(dog);
        Assert.assertEquals("BARK", dog.bark());
    }

    // get legs method needs to return 4
    @Test
    public void testLegs() {
        assertNotNull(dog);
        Assert.assertEquals(4, dog.getLegs());
    }

    // Mocks vs Spys
    @Test
    public void testName() {
        assertNotNull(dog);

        String dogName = dog.getName();

        Mockito.verify(animalNamerSpy).getName(dog);

        Assert.assertEquals("George Rover Dog", dogName);
    }
}
