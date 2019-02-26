package privetConstroctor;

/*
 * 1. To have control on the instantiation of the Java objects, it wont allow you to create an instance of an object.
 2. It wont allow the class to be subclassed
3. This has a special advantage when implementing the singleton Patterr f Private contstructors are used or it and 
have a control on the creating the instance for the w ole application. 
4.when you want to have a class with all constants or all of your methc in a class are static 
defined and Does not require its instance any more, then we declare that class as a private constructor. 
 */

/**
 *
 * @author Md Yasin Arif
 */
public class SingletonPattern {

    private static SingletonPattern obj = null;

    private  SingletonPattern() {
        /* Privet constractor will prevent the instantiationof 
        this class directly*/
    }

    public static SingletonPattern getInstance() {
        /* This logic will ensure that no more than one object can be cteated at a time*/
        if (obj == null) {
            obj = new SingletonPattern();
        }
        return obj;
    }

    public void display() {
        System.out.println("SingletonPattern example");
    }

    public static void main(String[] args) {
        //Object cannot be created directly due to private constructor 
        //This way it is forced to create object via our method where 
        //we have logic for only one object creation 
        //SingletonPattern obj = SingletonPattern.getInstance();
        
        SingletonPattern obj = new SingletonPattern();
        obj.display();
    }
}
