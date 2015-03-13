package ac.za.cput.chapter5.creationalTest;

import ac.za.cput.chapter5.config.Config;
import ac.za.cput.chapter5.creational.builder.Person;
import ac.za.cput.chapter5.creational.builder.PersonDirector;
import ac.za.cput.chapter5.creational.builder.PersonOne;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2015/03/13.
 */
public class buildertest {
    PersonOne one;
    Person pers;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        one = (PersonOne)ctx.getBean("builder2");
        PersonDirector pd = new PersonDirector(one);
        pd.constructPerson();
        pers = pd.getPerson();

    }

    @Test
    public void testName() throws Exception {


        Assert.assertEquals( pers.getAge(),23);

    }

    @After
    public void tearDown() throws Exception {


    }
}
