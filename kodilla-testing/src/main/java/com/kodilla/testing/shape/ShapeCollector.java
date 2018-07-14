package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    public ArrayList<Shape> collection = new ArrayList<>();

    public void addFigure(Shape shape){
        collection.add(shape);
    }
    public boolean removeFigure(Shape shape){
        boolean result = false;
        if(collection.contains(shape)){
            collection.remove(shape);
            result = true;
        }
        return result;
    }
    public Shape getFigure(int n) {
        Shape shape = null;
        if (n >= 0 && n < collection.size()) {
            shape = collection.get(n);
        }
        return shape;
    }
    public int getCollectionSize(){
        return collection.size();
    }
    public String showFigures(){
        String name = null;
        for (int i = 0; i < collection.size(); i++){
            name = collection.get(i).getShapeName() + " " + collection.get(i).getField();
        }
        return name;
    }
}
