package ac.za.cput.chapter5.config;

import ac.za.cput.chapter5.BehaviouralPatterns.TemplateMethod.TransplantOperation;
import ac.za.cput.chapter5.BehaviouralPatterns.TemplateMethod.ArthrodesisOperation;
import ac.za.cput.chapter5.BehaviouralPatterns.chainOfResponsibility.CarHandler;
import ac.za.cput.chapter5.BehaviouralPatterns.chainOfResponsibility.NissanHandler;
import ac.za.cput.chapter5.BehaviouralPatterns.chainOfResponsibility.ToyotaHandler;
import ac.za.cput.chapter5.creational.abstractfactory.AbstractFactory;
import ac.za.cput.chapter5.creational.abstractfactory.LandFactory;
import ac.za.cput.chapter5.creational.abstractfactory.SeaFactory;
import ac.za.cput.chapter5.creational.abstractfactory.Transport;
import ac.za.cput.chapter5.creational.builder.Person;
import ac.za.cput.chapter5.creational.builder.PersonBuilder;
import ac.za.cput.chapter5.creational.builder.PersonDirector;
import ac.za.cput.chapter5.creational.builder.PersonOne;
import ac.za.cput.chapter5.creational.factory.TransportFactory;
import ac.za.cput.chapter5.stuctural.adapter.MoneyInfo;
import ac.za.cput.chapter5.stuctural.adapter.RandAmountClass;
import ac.za.cput.chapter5.stuctural.adapter.RandAmountObject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by student on 2015/03/13.
 */
@Configuration
public class Config {


    @Bean (name= "TemplateMet1")
    public TransplantOperation getBurger()
    {
        return new TransplantOperation();
    }
    @Bean (name= "TemplateMet2")
    public ArthrodesisOperation getCheeseBurger()
    {
        return new ArthrodesisOperation();
    }

    @Bean (name= "chain1")
    public CarHandler nissan()
    {
        return new NissanHandler();
    }
    @Bean (name= "chain2")
    public CarHandler toyota()
    {
        return new ToyotaHandler();
    }

    @Bean (name= "abs4")
    public AbstractFactory abs()
    {
        return new AbstractFactory();
    }


    @Bean (name= "abs5")
    public LandFactory abs1()
    {
        return new LandFactory();
    }
    @Bean (name= "abs6")
    public SeaFactory abs2()
    {
        return new SeaFactory();
    }

    @Bean (name= "builder1")
    public Person builder1()
    {
        return new Person();
    }
    @Bean (name= "builder2")
    public PersonBuilder builder2()
    {
        return new PersonOne();
    }
    @Bean (name= "fact")
    public TransportFactory fact()
    {
        return new TransportFactory();
    }
    @Bean (name= "adap")
    public MoneyInfo adap()
    {
        return new RandAmountClass();
    }
    @Bean (name= "adap1")
    public MoneyInfo adap1()
    {
        return new RandAmountObject();
    }

}

