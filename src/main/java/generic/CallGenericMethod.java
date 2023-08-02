package generic;

import java.util.ArrayList;
import java.util.List;

public class CallGenericMethod {

    public static void main(String[] args) {

        GenericClass<Integer> pritnInteger = new GenericClass<>(9393);
        pritnInteger.printData();

        GenericClass<Double> printDouble = new GenericClass<>(03.3);
        printDouble.printData();

        GenericClass<String > printString = new GenericClass<>("This is my string");
        printString.printData();


        new AnimalGenericClass<>(new Cat());
        new AnimalGenericClass<>(new Dog());
        new AnimalGenericClass<>(new Dog());
        new AnimalGenericClass<>(new Dog());


        System.out.println("Returned value->"+new CallGenericMethod().hello("rakesh",32));

        List<Cat> catLists = new ArrayList<>();
        List<Dog> dogList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        catLists.add(new Cat());
        dogList.add(new Dog());
        integerList.add(new Integer(93));
        printAnyList(catLists);
        printAnyList(dogList);
        printAnyList(integerList);



    }

    public <T extends String, K extends Integer> K hello (T hey,K intValue){
        System.out.println(hey);
        System.out.println(intValue);
        return intValue;
    }

    public static void printAnyList(List<? extends Animal> anyList){

        System.out.println(anyList);
    }
}
