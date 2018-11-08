package com.company;

/**
 * Created by Roman on 08.11.2018.
 */
public class Plant {
    private Color color;
    private Type type;
    private int size;

    public Plant(String color, String type, int size) throws ColorException, TypeException{
        Color c = colorStringToEnum(color);
        Type t = typeStringToEnum(type);
        this.color = c;
        this.type = t;
        this.size = size;
    }

    private Color colorStringToEnum(String str) throws ColorException {
        switch (str.toLowerCase()) {
            case "white": return Color.WHITE;
            case "blue": return Color.BLUE;
            case "green": return Color.GREEN;
            case "black": return Color.BLACK;
            default: throw new ColorException("You input not exist color");
        }
    }

    private Type typeStringToEnum(String str) throws TypeException {
        switch (str.toLowerCase()) {
            case "rose": return Type.ROSE;
            case "chamomile": return Type.CHAMOMILE;
            case "chrysanthemums": return  Type.CHRYSANTHEMUMS;
            default: throw  new TypeException("You input not exist type");
        }
    }

    @Override
    public String toString() {
        return "Plant{" +
                "color=" + color +
                ", type=" + type +
                ", size=" + size +
                '}';
    }
}
