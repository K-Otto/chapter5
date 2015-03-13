package ac.za.cput.chapter5.creationalTest;

import ac.za.cput.chapter5.creational.singleton.Student;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/03/13.
 */
public class singletontest {
    private  Student stud;
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testName() throws Exception {
        stud = Student.instance();
        //Assert.assertEquals(stud.getName(), "Test");
        Assert.assertNotNull(stud);

    }

    @After
    public void tearDown() throws Exception {


    }
}
