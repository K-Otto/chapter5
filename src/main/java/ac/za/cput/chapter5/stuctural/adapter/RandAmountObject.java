package ac.za.cput.chapter5.stuctural.adapter;

/**
 * Created by student on 2015/03/13.
 */
public class RandAmountObject implements MoneyInfo {
    RandAmount randAmount;

    public RandAmountObject()
    {
        randAmount = new RandAmount();
    }

    @Override
    public double getMoneyInD()
    {
        return randToDollar(randAmount.getRands());
    }

    @Override
    public double getMoneyInR()
    {
        return randAmount.getRands();
    }

    @Override
    public void setMoneyInD(double rands)
    {
        randAmount.setMoneyInR(dollarToRand(rands));
    }

    @Override
    public void setMoneyInR(double rands)
    {
        randAmount.setMoneyInR(rands);
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
