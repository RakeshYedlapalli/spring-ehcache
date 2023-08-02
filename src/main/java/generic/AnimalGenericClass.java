package generic;

public class AnimalGenericClass <T extends Object & Animal> {

    T animal;

   public AnimalGenericClass(T animal){
       animal.talk();
    }
}
