package ru.skubatko.dev.java.core.stepik.chapter5.case541;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Case541 {

    public static Animal[] deserializeAnimalArray(byte[] data) {
        Animal[] animals = new Animal[0];
        try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))) {
            int arraySize = ois.readInt();
            animals = new Animal[arraySize];
            for (int i = 0; i < arraySize; i++) {
                animals[i] = (Animal) ois.readObject();
            }
        } catch (IOException | ClassNotFoundException | ClassCastException e) {
            throw new IllegalArgumentException();
        }

        return animals;
    }

}
