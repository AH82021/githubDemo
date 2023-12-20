package setDemo;


import java.util.*;

public class SetReview {
    public static void main(String[] args) {
        // Set : a collection of objects
        // set cannot contain duplicates values
        // Java set allow at most one null value
        // HashSet,LinkedHashSet,EnumSet , TreeSet

        //
        Set<String> animals = new HashSet<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        animals.add("Dog");
       animals.add(null);
        animals.add("Lion");

        System.out.println(animals.size());
        System.out.println(animals);

        for (String animal : animals) {
            if(animal != null) {
                System.out.println(animal.toUpperCase());
            }

        }


        int[] numbers = {1,2,3,324,3,56,2,67};
        Set<Integer> setNumbers = new HashSet<>();

        for (int number : numbers) {
            setNumbers.add(number);
        }
        System.out.println(setNumbers);
        if(numbers.length != setNumbers.size()){
            System.out.println("Duplicate values found ");
        }

      var var = "var";
        var number = 5;

     var numberList = new ArrayList<>();



    // HashSet
        // "John" -> []-> 23323232
        //23323232 -[] -> John


    }
}
