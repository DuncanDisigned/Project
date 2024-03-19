package exseptions;

import data.AnimalData;

public class AnimalNotSuppotted extends Exception {

    public AnimalNotSuppotted(AnimalData animalData) {
        super(String.format("Animal %s not supported", animalData.name()));
    }
}
