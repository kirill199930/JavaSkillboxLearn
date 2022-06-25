package SkillboxCat;

public class Cat
{
    private final double originWeight;
    private double weight;
    private static int count;

    private final double minWeight;
    private final double maxWeight;
    private final int eya;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;

        eya = 2;
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        int sum = 0;
        sum += amount;
        System.out.println("sumEat " + sum);
        weight += amount;

    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public void dead(){
        while (true){
            if(weight >= minWeight) meow();
            else break;
        }
    }


    public void pee(){
        weight -= 10;
        System.out.println(weight);
    }


    public Double getWeight()
    {
        return weight;
    }

    public static int countCat(){
        return count;
    }
    public void deadCat(){
        if (weight < minWeight) count--;
        else if (weight > maxWeight  ) count--;

    }



    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}