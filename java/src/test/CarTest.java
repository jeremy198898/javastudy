import junit.Car;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by jeremy on 2016/7/28.
 */
public class CarTest
{
    private Car car = new Car();

    @Test
    public void sayHi()
    {
        car.sayHi();
    }
}
