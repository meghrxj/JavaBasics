package EG1;

public class Cat {

    String name;

    public static void main(String[] agrs) {
        //make a cat object and access it

        Cat cat1 =  new Cat();
        cat1.meow();
        cat1.name = "Milo";

        // make a cat array 

        Cat[] myCats = new Cat[3];
        //put some cat in it 

        myCats[0] = new Cat();
        myCats[1] = new Cat();
        myCats[2] = cat1;

        //now access the Cats using the array access
        //refrences

        myCats[0].name = "Freddy";
        myCats[1].name = "Margey";

        System.out.print("last cat's name is ");
        System.out.println(myCats[2].name);

        //now loop through the array for cats

        // tell cats to meow 

        int x = 0;

        while(x < myCats.length) {

            myCats[x].meow();
            x = x + 1; 


        }
    }

    public void meow() {
        System.out.println(name + " says Meow!");
    }

    public void eat() { }
    public void runFromDogs() {}
}