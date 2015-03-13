package ac.za.cput.chapter5.creationalTest;

import ac.za.cput.chapter5.creational.prototype.Person;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/13.
 */
public class prototypetest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testName() throws Exception {
        Person p1 = new Person("Karl");
        Assert.assertEquals("Person's name is Karl", p1.getName());

        Person p2 = (Person)p1.cloner();
        Assert.assertEquals("Person's name is Karl", p2.getName());

    }

    @After
    public void tearDown() throws Exception {


    }
}
