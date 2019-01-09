package StaticVariableConstantsMethods.Variable;

public class StaticAnoutherEx {

    static int x = 100;

    static {
        x = 100;
        System.out.println("Block 1 : " + x);
    }

    public StaticAnoutherEx() {
        x = 500;
        System.out.println("I am default consructor" + x);
    }

    public static void main(String[] args) {
        StaticAnoutherEx obEx = new StaticAnoutherEx();
        x = 1000;
        System.out.println("I am from Main Method:"+x);
    }

    static {
        x = 300;
        System.out.println("Block 2 : " + x);
    }

}
