package ac.za.cput.chapter5.structuralTest;

import ac.za.cput.chapter5.config.Config;
import ac.za.cput.chapter5.stuctural.adapter.MoneyInfo;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2015/03/13.
 */
public class adaptertest {
    MoneyInfo m;
    MoneyInfo m2;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        m = (MoneyInfo)ctx.getBean("adap");
        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(Config.class);
        m2 = (MoneyInfo)ctx1.getBean("adap1");
    }

    @Test
    public void testName() throws Exception {

        m.setMoneyInR(40.00);
        Assert.assertEquals(40,m.getMoneyInR(), 2);
        Assert.assertEquals(5,m.getMoneyInD(), 2);


        m2.setMoneyInR(40.00);
        Assert.assertEquals( 40,m2.getMoneyInR(), 2);
        Assert.assertEquals(5,m.getMoneyInD(),  2);

    }

    @After
    public void tearDown() throws Exception {


    }
}
