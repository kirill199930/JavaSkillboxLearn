package SkillboxCat;


import com.skillbox.airport.Airport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Algorithm.Fac.factrial;
import static Algorithm.Fac.factrial2;

public class Loader
{


    public static void main(String[] args)
    {
        Cat cat = new Cat(1100.0);
        System.out.println(cat.getWeight());
        Cat cat1 = cat;
        System.out.println(cat1.getWeight());



        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        cat2.setColor("white");
        cat3.setColor("black");

        cat3.setColor(cat2.getColor());
        System.out.println(cat2.getColor());
        System.out.println(cat3.getColor());


        Airport airport = Airport.getInstance();
        System.out.println(airport.getAllAircrafts());

        List a = new ArrayList<>();
        a.add("kirill");
        a.add("cat");
        a.add("dog");
        a.remove(a.get(0));

        System.out.println(a);


        int n = 100;
        long [] arr = new long[n + 1];
        Arrays.fill(arr, -1);
        System.out.println(factrial2(n, arr));






       // Loader.getKitten();













        System.out.println(Cat.countCat());
        System.out.println(cat.getStatus());

    }

    private static Cat getKitten(){
        Cat cat = new Cat(1100.0);
        System.out.println(cat.getWeight());
        return cat;
    }
}