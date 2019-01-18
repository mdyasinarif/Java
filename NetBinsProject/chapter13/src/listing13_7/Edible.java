package listing13_7;

public interface Edible {

    public String howToEat();

    
}

abstract class Animal {

    public abstract String sound();

   
}
  class Tiger extends Animal {

        @Override
        public String sound() {
            return "Tiger: RRoood";
        }
    }
class Chicken extends Animal implements Edible {

    @Override
    public String sound() {
        return "Chicken : cock-a-dooble-doo";
    }

    @Override
    public String howToEat() {
        return "Chicken: Fry it";
    }

}

abstract class Fruit implements Edible {
   
}
class Apple extends Fruit {

        @Override
        public String howToEat() {
            return "Apple : Make apple cider";
        }

    }
class Orange extends Fruit {

        @Override
        public String howToEat() {
            return "Orange : Make Orange cider";
        }

    }
