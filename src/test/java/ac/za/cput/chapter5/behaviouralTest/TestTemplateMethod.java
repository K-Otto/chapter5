package ac.za.cput.chapter5.behaviouralTest;

import ac.za.cput.chapter5.BehaviouralPatterns.TemplateMethod.ArthrodesisOperation;
import ac.za.cput.chapter5.BehaviouralPatterns.TemplateMethod.TransplantOperation;
import ac.za.cput.chapter5.config.Config;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by student on 2015/03/13.
 */
public class TestTemplateMethod {
    private TransplantOperation operation1;
    private ArthrodesisOperation operation2;
    @Before
    public void setUp() throws Exception {



            ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
            operation1 = (TransplantOperation)ctx.getBean("TemplateMet1");
            ApplicationContext ctx1 = new AnnotationConfigApplicationContext(Config.class);
            operation2 = (ArthrodesisOperation)ctx1.getBean("TemplateMet2");

    }

    @Test
    public void testName() throws Exception {
        Assert.assertEquals( "Get equipment ready. Operating on patient. Operation not successful. Cleaning up after operation.",operation1.operate1());
        Assert.assertEquals("Get Equipment ready. Operating on patient. Operation was successful. Cleaning up after operation",operation2.operate1());


    }

    @After
    public void tearDown() throws Exception {


    }
}
