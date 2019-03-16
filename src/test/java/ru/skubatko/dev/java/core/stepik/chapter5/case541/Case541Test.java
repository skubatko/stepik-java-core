package ru.skubatko.dev.java.core.stepik.chapter5.case541;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Case541Test {

    @Test
    public void whenAnimalsPassed_thenSuccess() {
        // given
        Animal[] animals = new Animal[]{
                new Animal("testAnimal1"),
                new Animal("testAnimal2")
        };

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try (ObjectOutputStream ous = new ObjectOutputStream(out)) {
            ous.writeInt(animals.length);
            ous.writeObject(animals[0]);
            ous.writeObject(animals[1]);
            ous.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // when
        Animal[] result = Case541.deserializeAnimalArray(out.toByteArray());

        // then
        Assert.assertArrayEquals("wrong result!!", animals, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenAnimalsPassedWithExtraInt_thenException() {
        // given
        Animal[] animals = new Animal[]{
                new Animal("testAnimal1"),
                new Animal("testAnimal2")
        };

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try (ObjectOutputStream ous = new ObjectOutputStream(out)) {
            ous.writeInt(animals.length);
            ous.writeInt(5);
            ous.writeObject(animals[0]);
            ous.writeObject(animals[1]);
            ous.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // when
        Animal[] result = Case541.deserializeAnimalArray(out.toByteArray());

        // then
        Assert.assertArrayEquals("wrong result!!", animals, result);
    }

}
