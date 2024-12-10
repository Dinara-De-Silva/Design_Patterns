package Behavioral_Memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RectangleCaretaker {
    private List<RectangleMemento> history=new ArrayList<>();
    public void addMemento(RectangleMemento obj){
        history.add(obj);
    }
    public RectangleMemento undo(){
        if(!history.isEmpty()){
            int index=history.size()-1;
            RectangleMemento lastMeme=history.get(index);
            history.remove(index);
            return lastMeme;
        }
        return null;
    }
}
