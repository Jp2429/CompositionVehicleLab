import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.beasts.Dragon;
import wizard_management.carpets.MagicCarpet;
import wizard_management.cleaning.Broomstick;
import wizard_management.people.Wizard;


public class WizardTest {

    Wizard wizard;
    Broomstick broomstick;

    @Before
    public void before(){
        broomstick = new Broomstick("Nimbus", 10);
        wizard = new Wizard("Toby", broomstick);
    }

    @Test
    public void hasName(){
        assertEquals("Toby", wizard.getName());
    }

    @Test
    public void hasBroomstick(){
        Broomstick broomstick1=(Broomstick) wizard.getRide();
        assertEquals("Nimbus", broomstick1.getBrand());
    }

    @Test
    public void canFly(){
        assertEquals(wizard.fly(),"mounting broom, running, skipping, flying!");
    }
    @Test
    public void canFlyDragon(){
        Dragon dragon=new Dragon("Tilly");
        wizard=new Wizard("Tobi",dragon);
        assertEquals("Standing up tall, beating wings, lift off!",wizard.fly());
    }
    @Test
    public void canChangeRide(){
        MagicCarpet magicCarpet=new MagicCarpet("blue");
        wizard.setRide(magicCarpet);
        assertEquals("Hovering up, straightening out, flying off!",wizard.fly());
    }
//    @Test
//    public void canTest(){
//        assertEquals(broomstick,wizard.getRide());
//    }
}
