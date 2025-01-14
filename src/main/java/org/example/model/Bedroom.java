package org.example.model;

public class Bedroom extends Room{
    private String name;
    private Bed bed;
    private Lamp lamp;
    private Wardrobe wardrobe;
    private Carpet carpet;

    public Bedroom(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, String name, Bed bed, Lamp lamp, Wardrobe wardrobe, Carpet carpet) {
        //super(); Eğer super() yazmasan bile parentın constructorı çalışır.
        super(wall1,wall2,wall3,wall4,ceiling);
        this.name = name;
        this.bed = bed;
        this.lamp = lamp;
        this.wardrobe = wardrobe;
        this.carpet = carpet;
    }

    public String getName() {
        return name;
    }

    public Bed getBed() {
        return bed;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Carpet getCarpet() {
        return carpet;
    }
}
