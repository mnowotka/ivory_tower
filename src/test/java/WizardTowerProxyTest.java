import junit.framework.TestCase;

public class WizardTowerProxyTest extends TestCase {

    public void testProxy(){
        WizardTowerProxy proxy = new WizardTowerProxy(new IvoryTower());
        proxy.enter(new Wizard("Red wizard")); // Red wizard enters the tower.
        proxy.enter(new Wizard("White wizard")); // White wizard enters the tower.
        proxy.enter(new Wizard("Black wizard")); // Black wizard enters the tower.
        proxy.enter(new Wizard("Green wizard")); // Green wizard is not allowed to enter!
        proxy.enter(new Wizard("Brown wizard")); // Brown wizard is not allowed to enter!
    }
}
