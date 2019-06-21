import Game.Players.*;
import Game.Items.*;
import org.junit.Before;

public class BarbarianTest {

    Barbarian barbarian;
    Weapon butterKnife;

    @Before
    public void before() {
        butterKnife = new Weapon(WeaponType.BUTTER_KNIFE);
        barbarian = new Barbarian("Kelly", butterKnife);
    }
    


}
