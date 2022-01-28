package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Dogs dog1 = new Dogs();
             dog1.age = 3;
             dog1.dogBreed = "Ciobanesc";
             dog1.color  = "white";
             dog1.name = "Tarzan";
             dog1.vaccine = true;

             Nutrition nutrition1 = new Nutrition();
                nutrition1.activity = true;
                nutrition1.foodSupplements = "Calcium";
                nutrition1.forbiddenFood = "Avocado";
                nutrition1.water = 0.5;


        Dogs dog2 = new Dogs();
            dog2.age = 4;
            dog2.dogBreed = "Bichom";
            dog2.color = "black";
            dog2.name = "Bruno";
            dog2.vaccine = true;

            Nutrition nutrition2 = new Nutrition();
            nutrition2.activity = false;
            nutrition2.foodSupplements = "PetWay";
            nutrition2.forbiddenFood = "onion";
            nutrition2.water = 1;


        System.out.println("The age of the first dog " + dog1.age);
        System.out.println("The first dog breed " + dog1.dogBreed);
        System.out.println("The first dog color " + dog1.color);
        System.out.println("The name of the first dog " + dog1.name);
        System.out.println("The first dog is vaccined " + dog1.vaccine);
        System.out.println("The age of the second dog " + dog2.age);
        System.out.println("The second dog breed " + dog2.dogBreed);
        System.out.println("The second dog color " + dog2.color);
        System.out.println("The name of the second dog " + dog2.name);
        System.out.println("The second dog is vaccined " + dog2.vaccine);














    }
}
