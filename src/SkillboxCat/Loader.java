package SkillboxCat;

public class Loader
{
    public static void main(String[] args)
    {
        Cat cat = new Cat(1100.0);
        System.out.println(cat.getWeight());

        Loader.getKitten();




        Cat cat1 = new Cat();









        System.out.println(Cat.countCat());
        System.out.println(cat.getStatus());

    }

    private static Cat getKitten(){
        Cat cat = new Cat(1100.0);
        System.out.println(cat.getWeight());
        return cat;
    }
}