package org.example.model;

public class Room {
    private Wall wall1, wall2, wall3, wall4;
    private Ceiling ceiling;

    //Eğer bu şekilde default oluşturursan child içinde super(wall1,...) şeklinde parametreli veya
    //super(); yazmadan direk çalışmasını sağlarsın.
    public Room()
    {

    }

    String name = "Ali " + "Umur" + "Ali ";
    String name2 = new String("Kucur0");
    String name3 = name; //Bu şekilde yazdığında String Poolda yeni bir adres ve string oluşmuyor
    //name = "Emrah";//Bu şekilde yazınca ama artık yeni bir adres ve string oluşuyor
    //0x1fc0

    public Room(Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }
}
