package co.uk.safebear.kennels;

public class Dog {
    public String name;
    public String breed;
    public int age;
    public boolean isVaccainated;

    public void setAge (int newAge)
    {age = newAge;
    }

    public void setName (String setName)
    {name = setName;
    }

    public void setBreed (String setBreed){
        breed = setBreed;
    }

    public void updateVacs (boolean vacStatus) {
        isVaccainated = vacStatus;
    }

    public boolean getVacs(){
        return isVaccainated;
    }
    }

