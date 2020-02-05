package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        System.out.println(d.speak());
        Bird b = (Bird)d;  // upcasting
        Animal a = (Animal)b; // upcasting
        System.out.println(a.speak());
        Duck d2 = (Duck) a; // downcasting
        train(new Duck());
        /*tries to convert Parrot into Duck at runtime. Doesn't work => ClassCastException
          has to be of the same type to begin with.
         */
        // train(new Parrot());
        Animal a2 = new Animal();
        Bird b2 = new Bird();
    }

    private static void train(Bird bird) {
        if (bird instanceof Duck){
            Duck d = (Duck) bird;
            d.swim();   //cannot call bird.swim() as the bird is of Bird class.
        }
    }
}
