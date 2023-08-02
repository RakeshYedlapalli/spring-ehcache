package generic;

public class GenericClass <T> {

    T someData;

    public  GenericClass(T someData){
        this.someData = someData;
    }

    public void printData(){
        System.out.println(someData);
    }

}
