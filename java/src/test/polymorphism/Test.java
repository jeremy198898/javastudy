package polymorphism;

/**
 * Created by jeremy on 2016/8/1.
 */
public class Test
{
    private Fruit fruit = new Fruit();
    private Fruit fruit1 = new Apple();

    @org.junit.Test
    public void test()
    {
        fruit.property();
        fruit1.property();
    }
}
