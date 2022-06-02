package L11_Facade;

public class Demo {

    public static void main(String[] args) {
        SecurityFacade securityFacade = new SecurityFacade();

        securityFacade.getStatus();
        System.out.println();

        securityFacade.allOn();
        System.out.println();

        securityFacade.getStatus();
        System.out.println();

        securityFacade.allOff();
        System.out.println();

        securityFacade.getStatus();
    }
}
