import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IvoryTower implements WizardTower {
    private static final Logger LOGGER = LoggerFactory.getLogger(IvoryTower.class);
    public boolean enter(Wizard wizard) {
        LOGGER.info("{} enters the tower.", wizard);
        return true;
    }

}