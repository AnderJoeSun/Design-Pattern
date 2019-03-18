package facade;

import facade.subsystem.SubSystemA;
import facade.subsystem.SubSystemB;

public class Facade implements FacadeInterface {
    private SubSystemA systemA;
    private SubSystemB systemB;

}
