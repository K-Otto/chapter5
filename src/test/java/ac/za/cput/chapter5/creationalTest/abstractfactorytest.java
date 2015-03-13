package ac.za.cput.chapter5.creationalTest;

import ac.za.cput.chapter5.config.Config;
import ac.za.cput.chapter5.creational.abstractfactory.AbstractFactory;
import ac.za.cput.chapter5.creational.abstractfactory.Transport;
import ac.za.cput.chapter5.creational.abstractfactory.TransportFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2015/03/13.
 */
public class abstractfactorytest {
    AbstractFactory abs;
    Transport t1;
    Transport t2;
    TransportFactory ts;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        abs = (AbstractFactory)ctx.getBean("abs4");
        ts = abs.getTransportFactory("land");
        t1 = ts.getTransport("Audi");
        t2 = ts.getTransport("Raleigh");

    }

    @Test
    public void testLand() throws Exception {
        Assert.assertEquals(t1.typeOfTransport(), "Car");
        Assert.assertEquals(t2.typeOfTransport(), "Bike");

    }

    @Test
    public void testSea() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        abs = (AbstractFactory)ctx.getBean("abs4");
        TransportFactory ts = abs.getTransportFactory("sea");
        Transport t1 = ts.getTransport("boat");
        Transport t2 = ts.getTransport("waterbike");

        Assert.assertEquals(t1.typeOfTransport(), "Boat");
        Assert.assertEquals(t2.typeOfTransport(), "JetSki");
    }

    @After
    public void tearDown() throws Exception {


    }
}
