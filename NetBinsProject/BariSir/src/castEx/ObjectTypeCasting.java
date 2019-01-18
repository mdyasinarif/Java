package castEx;

class Animal {

    int helth = 100;
}

class Cat extends Animal {

    int body = 200;
}

public class ObjectTypeCasting {

    public static void main(String[] args) {
        Animal an = new Animal();
        System.out.println("Animal to Anaimal:" + an.helth);
        Cat ca = new Cat();
        System.out.println("Cat to Cat:" + ca.body);
        System.out.println("Cat inharant Animal:" + ca.helth);

        an = ca; // upcasting  reference copy hoysa 
        System.out.println("Animal to Cat casting:" + an.helth);
        // System.out.println("Animal to Cat casting:"+an.body); not work

        ca = (Cat) an; // downcasting not work without upcasting
        System.out.println("Cat to Animal casting:" + ca.body);
        System.out.println("Cat to Animal casting:" + ca.helth);

    }
}
