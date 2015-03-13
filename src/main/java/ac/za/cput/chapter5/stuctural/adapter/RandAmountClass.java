package ac.za.cput.chapter5.stuctural.adapter;

/**
 * Created by student on 2015/03/13.
 */
public class RandAmountClass extends RandAmount implements MoneyInfo{

    @Override
    public double getMoneyInR()
    {
        return rands;
    }

    @Override
    public double getMoneyInD()
    {
        return randToDollar(rands);
    }

    @Override
    public void setMoneyInR(double rands)
    {
        this.rands = rands;
    }

    @Override
    public void setMoneyInD(double rands)
    {
        this.rands = dollarToRand(rands);
    }

    private double dollarToRand(double d)
    {
        return d * 8;
    }

    private double randToDollar(double r)
    {
        return r/8;
    }
}