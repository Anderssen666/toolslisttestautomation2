package co.uk.safebear.kennels;

public class Dog {
    public String name;
    public String breed;
    public int age;
    public boolean isVaccinated;

    public void setAge (int newAge)
    {age = newAge;
    }

    public void setName (String setName)
    {name = setName;
    }

    public void setBreed (String setBreed){
        breed = setBreed;
    }

    public String getBreed (){
        return breed;
    }

    public void updateVacs (boolean vacStatus) {
        isVaccinated = vacStatus;
    }

    public boolean getVacs(){
        return isVaccinated;
    }
    public void bark(){
        System.out.println("Woof, woof");
    }

    }

