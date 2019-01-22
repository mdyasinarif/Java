
package instanceVsStaticVarianble;


public class InstanceCounter {
    static {
        System.out.println("Class instanceCounter Loading...");
    }
    static final long ONE_DAY_IN_MINLLIS = 24*60*60*1000;
    static int instanceCounter;
    
    static {
        System.out.println("ONE_DAY_IN_MINLLIS "+ONE_DAY_IN_MINLLIS+" instanceCounter "+instanceCounter);
    }
    {
        instanceCounter++;
        System.out.println("InstanceCounter"+instanceCounter);
    }
    
    public static void main(String[] args) {
        System.out.println("Strating instanceCounter loading");
        new InstanceCounter();
        new InstanceCounter();
        new InstanceCounter();
    }
    static {
        System.out.println("Class instanceCounter Loading...");
    }
}
