
public class Loader
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        Cat cat1 = new Cat();
        cat1.feed(25000.);
        //cat1.getWeight();
        cat1.deadCat();

        Cat cat2 = new Cat();
        cat2.dead();
        cat2.getWeight();
        cat2.deadCat();


        System.out.println( Cat.countCat());



        System.out.println(cat.getStatus());
        System.out.println(cat1.getStatus());
        System.out.println(cat2.getStatus());
    }
}