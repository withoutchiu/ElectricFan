package Fan;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Fan.Electricfan;

/**
 * The test class ElectricfanTest.
 *
 * @author  (Gilbert)
 * @version (10192022)
 */
public class ElectricfanTest
{
    private Electricfan electricFan;


    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        electricFan = new Electricfan();
    }

     @Test
     public void IncreaseSpeedTest(){
        assertEquals(Electricfan.Direction.FORWARD, electricFan.getDirection());
        assertEquals(Electricfan.OFF, electricFan.getSpeed());
         
        electricFan.pullSpeedCord();
         
        //+1 to speeed
        assertEquals(1, electricFan.getSpeed());
        assertEquals(Electricfan.Direction.FORWARD, electricFan.getDirection());
        System.out.println(electricFan.toString());
         
        electricFan.pullSpeedCord();
         
        //+1 to speeed
        assertEquals(2, electricFan.getSpeed());
        assertEquals(Electricfan.Direction.FORWARD, electricFan.getDirection());
        System.out.println(electricFan.toString());
        
        electricFan.pullSpeedCord();
         
        //+1 to speeed
        assertEquals(3, electricFan.getSpeed());
        assertEquals(Electricfan.Direction.FORWARD, electricFan.getDirection());
        System.out.println(electricFan.toString());
        
        electricFan.pullSpeedCord();
         
        //Should be OFF = 0
        assertEquals(Electricfan.OFF, electricFan.getSpeed());
        assertEquals(Electricfan.Direction.FORWARD, electricFan.getDirection());
        System.out.println(electricFan.toString());
     }
     
     @Test
     public void ReverseDirectionTest(){
        assertEquals(Electricfan.Direction.FORWARD, electricFan.getDirection());
        assertEquals(Electricfan.OFF, electricFan.getSpeed());
         
        electricFan.pullSpeedCord();
        
        //+1 to speeed
        assertEquals(1, electricFan.getSpeed());
        assertEquals(Electricfan.Direction.FORWARD, electricFan.getDirection());
        System.out.println(electricFan.toString());
        
        electricFan.pullDirectionCord();
        
        //Change direction
        assertEquals(1, electricFan.getSpeed());
        assertEquals(Electricfan.Direction.BACKWARD, electricFan.getDirection());
        System.out.println(electricFan.toString());
        
        electricFan.pullSpeedCord();
        electricFan.pullDirectionCord();
        
        //Speed should be 2 and Should be forward now
        assertEquals(2, electricFan.getSpeed());
        assertEquals(Electricfan.Direction.FORWARD, electricFan.getDirection());
        System.out.println(electricFan.toString());
        
        electricFan.pullSpeedCord();
        electricFan.pullSpeedCord();
        electricFan.pullDirectionCord();
        
        //Speed should be 0 now since pull cord twice and Should be backward now
        assertEquals(Electricfan.OFF, electricFan.getSpeed());
        assertEquals(Electricfan.Direction.BACKWARD, electricFan.getDirection());
        System.out.println(electricFan.toString());
     }
}
